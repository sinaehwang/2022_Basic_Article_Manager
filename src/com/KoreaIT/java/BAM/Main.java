package com.KoreaIT.java.BAM;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("===프로그램시작====");

		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (true) {//"명령어 실행문을 무한반복시킨다.
			System.out.print("명령어)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //명령어 입력을 안한 경우의 수를 만들어줘야 "존재하지않는~"이 실행되지않는다.**continue로 맨처음으로 돌아가게함
			}

			if (command.equals("exit")) {
				break;
			} 
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
			}
		}
		System.out.println("===프로그램종료=====");
		
	}
}

