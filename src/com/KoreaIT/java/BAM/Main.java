package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("===프로그램시작====");
=======
		System.out.println("===�봽濡쒓렇�옩�떆�옉====");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692

		Scanner sc = new Scanner(System.in);

		int num = 0;
<<<<<<< HEAD
		List<Article>articles = new ArrayList<>();
		
		while (true) {//"명령어 실행문을 무한반복시킨다.
			System.out.print("명령어)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //명령어 입력을 안한 경우의 수를 만들어줘야 "존재하지않는~"이 실행되지않는다.**continue로 맨처음으로 돌아가게함
=======
		while (true) {//"紐낅졊�뼱 �떎�뻾臾몄쓣 臾댄븳諛섎났�떆�궓�떎.
			System.out.print("紐낅졊�뼱)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //紐낅졊�뼱 �엯�젰�쓣 �븞�븳 寃쎌슦�쓽 �닔瑜� 留뚮뱾�뼱以섏빞 "議댁옱�븯吏��븡�뒗~"�씠 �떎�뻾�릺吏��븡�뒗�떎.**continue濡� 留⑥쿂�쓬�쑝濡� �룎�븘媛�寃뚰븿
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}

			if (command.equals("exit")) {
				break;
			} 
<<<<<<< HEAD
			if (command.equals("article list")) {
				if(articles.size()==0) {
					System.out.println("게시글이 없습니다.");
					continue;
				}
				else {
					for(int i=articles.size()-1; i>=0; i--) {
						Article article = articles.get(i);//articles.get(i)인덱스값을 article 새변수저장시켜서 사용한다.
						System.out.println("번호/제목\n"+article.id+article.title);
					}
				}
			} 
			
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//반복문 밖에 선언했기때문에 num값은 계속 증가값이된다.
				String title = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("제목:%s\n", title);
				System.out.printf("본문:%s\n", body);
				System.out.printf("%d번글이생성됬습니다.\n", id);
				Article article = new Article(id, title, body);
				articles.add(article);//articles 배열에 저장한다.
			}

			else {
				System.out.println("존재하지 않는 명령어입니다.");
=======
			else if (command.equals("article list")) {
				System.out.println("寃뚯떆湲��씠 �뾾�뒿�땲�떎.");
			} 
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//諛섎났臾� 諛뽰뿉 �꽑�뼵�뻽湲곕븣臾몄뿉 num媛믪�� 怨꾩냽 利앷��媛믪씠�맂�떎.
				String article = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("�젣紐�:%s\n", article);
				System.out.printf("蹂몃Ц:%s\n", body);
				System.out.printf("%d踰덇���씠�깮�꽦�맟�뒿�땲�떎.\n", id);
			}

			else {
				System.out.println("議댁옱�븯吏� �븡�뒗 紐낅졊�뼱�엯�땲�떎.");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}
		}
		System.out.println("===�봽濡쒓렇�옩醫낅즺=====");
		
	}
}
class Article {
	int id;
	String title;
	String body;

	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}
