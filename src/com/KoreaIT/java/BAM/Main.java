package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("===���α׷�����====");
=======
		System.out.println("===프로그램시작====");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692

		Scanner sc = new Scanner(System.in);

		int num = 0;
<<<<<<< HEAD
		List<Article>articles = new ArrayList<>();
		
		while (true) {//"��ɾ� ���๮�� ���ѹݺ���Ų��.
			System.out.print("��ɾ�)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //��ɾ� �Է��� ���� ����� ���� �������� "���������ʴ�~"�� ��������ʴ´�.**continue�� ��ó������ ���ư�����
=======
		while (true) {//"명령어 실행문을 무한반복시킨다.
			System.out.print("명령어)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //명령어 입력을 안한 경우의 수를 만들어줘야 "존재하지않는~"이 실행되지않는다.**continue로 맨처음으로 돌아가게함
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}

			if (command.equals("exit")) {
				break;
			} 
<<<<<<< HEAD
			if (command.equals("article list")) {
				if(articles.size()==0) {
					System.out.println("�Խñ��� �����ϴ�.");
					continue;
				}
				else {
					for(int i=articles.size()-1; i>=0; i--) {
						Article article = articles.get(i);//articles.get(i)�ε������� article ������������Ѽ� ����Ѵ�.
						System.out.println("��ȣ/����\n"+article.id+article.title);
					}
				}
			} 
			
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//�ݺ��� �ۿ� �����߱⶧���� num���� ��� �������̵ȴ�.
				String title = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("����:%s\n", title);
				System.out.printf("����:%s\n", body);
				System.out.printf("%d�����̻�������ϴ�.\n", id);
				Article article = new Article(id, title, body);
				articles.add(article);//articles �迭�� �����Ѵ�.
			}

			else {
				System.out.println("�������� �ʴ� ��ɾ��Դϴ�.");
=======
			else if (command.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			} 
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//반복문 밖에 선언했기때문에 num값은 계속 증가값이된다.
				String article = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("제목:%s\n", article);
				System.out.printf("본문:%s\n", body);
				System.out.printf("%d번글이생성됬습니다.\n", id);
			}

			else {
				System.out.println("존재하지 않는 명령어입니다.");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}
		}
		System.out.println("===프로그램종료=====");
		
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
