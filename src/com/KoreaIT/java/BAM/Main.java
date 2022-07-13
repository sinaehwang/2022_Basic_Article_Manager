package com.KoreaIT.java.BAM;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("===프로그램시작====");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어)");
			String command = sc.next();
			if(command.equals("exit")) {
				break;
			}

			else {
				System.out.println("존재하지않습니다.");				
			}
			}
		
			if(command.equals("article write")) {
				String text = sc.next();
				String body = sc.next();
				System.out.printf("제목:%s",text);
				System.out.printf("제목:%s",body);
				System.out.println("1번글이 생성되었습니다.");
			}
			command = sc.next();
			if(command.equals("article write")) {
				String text = sc.next();
				String body = sc.next();
				System.out.printf("제목:%s",text);
				System.out.printf("제목:%s",body);
				System.out.println("2번글이 생성되었습니다.");
			}
			
			else {
				System.out.println("잘못입력됬습니다");
			}
			command = sc.next();
		}
		System.out.println("===프로그램종료=====");
		
	}
}

