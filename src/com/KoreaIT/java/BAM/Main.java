package com.KoreaIT.java.BAM;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("===���α׷�����====");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("��ɾ�)");
			String command = sc.next();
			if(command.equals("exit")) {
				break;
			}

			else {
				System.out.println("���������ʽ��ϴ�.");				
			}
			}
		
			if(command.equals("article write")) {
				String text = sc.next();
				String body = sc.next();
				System.out.printf("����:%s",text);
				System.out.printf("����:%s",body);
				System.out.println("1������ �����Ǿ����ϴ�.");
			}
			command = sc.next();
			if(command.equals("article write")) {
				String text = sc.next();
				String body = sc.next();
				System.out.printf("����:%s",text);
				System.out.printf("����:%s",body);
				System.out.println("2������ �����Ǿ����ϴ�.");
			}
			
			else {
				System.out.println("�߸��Է���ϴ�");
			}
			command = sc.next();
		}
		System.out.println("===���α׷�����=====");
		
	}
}

