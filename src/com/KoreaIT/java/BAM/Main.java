package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private	static List<Article> articles; //메인메소드와 makeTestDate 메소드가 접근할수있도록 전역으로 빼줌
	
	static {//static은 static끼리만 공유가능함 
		articles = new ArrayList<>();
	}
	
	public static void main(String[] args) {//메인 클래스의 메인메소드부분
		System.out.println("==프로그램 시작==");
		
		makeTestDate();

		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;

		
		while (true) {

			System.out.printf("명령어 ) ");
			String cmd = sc.nextLine().trim();
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article write")) {
				
				int id = articles.size() + 1; //테스트 데이터 실행후 write 실행을 하게되면 1번글로 출력됨(중복키x)=>id를 articles+1로 수정을 하면 오류해결
				//lastArticleId = id;
				String regDate = Util.getNowDateStr();
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body,regDate);
				articles.add(article);

				System.out.printf("%d번 글이 생성되었습니다\n", id);

			} else if (cmd.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다");
					continue;
				}
				
				System.out.println("번호  |   제목  |      날짜      |조회");
				
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d | %s |%s |%d \n", article.id, article.title,article.regDate,article.hit);
				}

			} else if (cmd.startsWith("article detail ")) {

				String[] cmdBits = cmd.split(" ");

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {

						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 없어\n", id);
					continue;
					
				} 
				else {
					foundArticle.incresehit();
					System.out.printf("번호 : %d\n", foundArticle.id);
					System.out.printf("날짜 : %s\n", foundArticle.regDate);
					System.out.printf("제목 : %s\n", foundArticle.title);
					System.out.printf("내용 : %s\n", foundArticle.body);
					System.out.printf("조회수 :%d\n", foundArticle.hit);

				}

			} 
			else if(cmd.startsWith("article delete ")) {
				
				String[] cmdbit2 = cmd.split(" ") ;
				
				int id = Integer.parseInt(cmdbit2[2]);
				
				Article foundArticle =null;
				
				int foundIndex=-1;//0을 쓰면 인덱스에는 0이 있기떄문에 1첫째글을 무조건 지우게 된다.그래서 0은 안됨
				
				for(int i=0; i<articles.size(); i++) {
					
					Article article = articles.get(i);
					
					if(article.id==id) {
						//delArticle = article; id가 아닌 인덱스로 삭제글을 찾을꺼기때문에 필요가없어짐
						foundIndex = i;
						break;
					}
				}
				
				if(foundIndex==-1) {
					System.out.printf("%d번 게시물은 없어\n", id);
					continue;
				}
				
				articles.remove(foundIndex);
				System.out.printf("%d번 게시물을 삭제했습니다\n", id);
				
			}
			
			else if(cmd.startsWith("article modify ")) {

				String[] cmdBits = cmd.split(" ");

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 없습니다.\n", id);
					continue;
					
				} else {
					System.out.printf("제목 : ");
					String title = sc.nextLine();
					System.out.printf("내용 : ");
					String body = sc.nextLine();
					foundArticle.title = title;
					foundArticle.body = body;
					System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
					
					
				}

			} 
				
			else {
				System.out.println("존재하지 않는 명령어입니다");
			}
		}

		System.out.println("==프로그램 끝==");
		sc.close();
	}

	private static void makeTestDate() {//메인 클래스의 makeTestDate 메소드 부분
		System.out.println("테스트를 위한 데이터를 생성합니다.");
		articles.add(new Article(1, "제목1","내용1", Util.getNowDateStr(), 1));
		articles.add(new Article(2, "제목2","내용2", Util.getNowDateStr(), 2));
		articles.add(new Article(3, "제목3","내용3", Util.getNowDateStr(), 3));
		
	}

}

class Article {
	int id;
	String title;
	String body;
	String date;
	String regDate;
	int hit;

	Article(int id, String title, String body,String regDate) {//매개변수가 4개일때 생성자와
		this(id, title, body, regDate, 0);//밑에와 상동한 결과값을 가져올수있다.
//		this.id = id;
//		this.title = title;
//		this.body = body;
//		this.regDate = regDate;
//		this.hit =0;
	}
	
	Article(int id, String title, String body,String regDate,int hit) {//매개변수가 5개일때 생성자를 구분하면 각각에 맞게 호출가능
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
		this.hit =hit;
	}
	public void incresehit() {
		hit++;
		
	}
	
}