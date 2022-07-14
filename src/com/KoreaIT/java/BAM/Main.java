package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("===���α׷�����====");

		Scanner sc = new Scanner(System.in);

		int num = 0;
		List<Article>articles = new ArrayList<>();
		
		while (true) {//"��ɾ� ���๮�� ���ѹݺ���Ų��.
			System.out.print("��ɾ�)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //��ɾ� �Է��� ���� ����� ���� �������� "���������ʴ�~"�� ��������ʴ´�.**continue�� ��ó������ ���ư�����
			}

			if (command.equals("exit")) {
				break;
			} 
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
			}
		}
		System.out.println("===���α׷�����=====");
		
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
