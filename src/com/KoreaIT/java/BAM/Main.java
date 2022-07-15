package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>();
		
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
				
				int id = lastArticleId + 1;
				lastArticleId = id;
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
				
				System.out.println("번호    |   제목  |   날짜");
				
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d	|	%s |%s \n", article.id, article.title,article.regDate);
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
					
				} else {
					System.out.printf("번호 : %d\n", foundArticle.id);
					System.out.printf("날짜 : %s\n", foundArticle.regDate);
					System.out.printf("제목 : %s\n", foundArticle.title);
					System.out.printf("내용 : %s\n", foundArticle.body);

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
				
			else {
				System.out.println("존재하지 않는 명령어입니다");
			}
		}

		System.out.println("==프로그램 끝==");
		sc.close();
	}

}

class Article {
	int id;
	String title;
	String body;
	String date;
	String regDate;

	Article(int id, String title, String body,String regDate) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
	}
}