package com.KoreaIT.java.BAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("===ÇÁ·Î±×·¥½ÃÀÛ====");
=======
		System.out.println("===í”„ë¡œê·¸ëž¨ì‹œìž‘====");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692

		Scanner sc = new Scanner(System.in);

		int num = 0;
<<<<<<< HEAD
		List<Article>articles = new ArrayList<>();
		
		while (true) {//"¸í·É¾î ½ÇÇà¹®À» ¹«ÇÑ¹Ýº¹½ÃÅ²´Ù.
			System.out.print("¸í·É¾î)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //¸í·É¾î ÀÔ·ÂÀ» ¾ÈÇÑ °æ¿ìÀÇ ¼ö¸¦ ¸¸µé¾îÁà¾ß "Á¸ÀçÇÏÁö¾Ê´Â~"ÀÌ ½ÇÇàµÇÁö¾Ê´Â´Ù.**continue·Î ¸ÇÃ³À½À¸·Î µ¹¾Æ°¡°ÔÇÔ
=======
		while (true) {//"ëª…ë ¹ì–´ ì‹¤í–‰ë¬¸ì„ ë¬´í•œë°˜ë³µì‹œí‚¨ë‹¤.
			System.out.print("ëª…ë ¹ì–´)");
			String command = sc.nextLine().trim();
			if(command.length()==0) {
				continue; //ëª…ë ¹ì–´ ìž…ë ¥ì„ ì•ˆí•œ ê²½ìš°ì˜ ìˆ˜ë¥¼ ë§Œë“¤ì–´ì¤˜ì•¼ "ì¡´ìž¬í•˜ì§€ì•ŠëŠ”~"ì´ ì‹¤í–‰ë˜ì§€ì•ŠëŠ”ë‹¤.**continueë¡œ ë§¨ì²˜ìŒìœ¼ë¡œ ëŒì•„ê°€ê²Œí•¨
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}

			if (command.equals("exit")) {
				break;
			} 
<<<<<<< HEAD
			if (command.equals("article list")) {
				if(articles.size()==0) {
					System.out.println("°Ô½Ã±ÛÀÌ ¾ø½À´Ï´Ù.");
					continue;
				}
				else {
					for(int i=articles.size()-1; i>=0; i--) {
						Article article = articles.get(i);//articles.get(i)ÀÎµ¦½º°ªÀ» article »õº¯¼öÀúÀå½ÃÄÑ¼­ »ç¿ëÇÑ´Ù.
						System.out.println("¹øÈ£/Á¦¸ñ\n"+article.id+article.title);
					}
				}
			} 
			
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//¹Ýº¹¹® ¹Û¿¡ ¼±¾ðÇß±â¶§¹®¿¡ num°ªÀº °è¼Ó Áõ°¡°ªÀÌµÈ´Ù.
				String title = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("Á¦¸ñ:%s\n", title);
				System.out.printf("º»¹®:%s\n", body);
				System.out.printf("%d¹ø±ÛÀÌ»ý¼º‰ç½À´Ï´Ù.\n", id);
				Article article = new Article(id, title, body);
				articles.add(article);//articles ¹è¿­¿¡ ÀúÀåÇÑ´Ù.
			}

			else {
				System.out.println("Á¸ÀçÇÏÁö ¾Ê´Â ¸í·É¾îÀÔ´Ï´Ù.");
=======
			else if (command.equals("article list")) {
				System.out.println("ê²Œì‹œê¸€ì´ ì—†ìŠµë‹ˆë‹¤.");
			} 
			else if (command.equals("article write")) {
				int id = num+1;
				num++;//ë°˜ë³µë¬¸ ë°–ì— ì„ ì–¸í–ˆê¸°ë•Œë¬¸ì— numê°’ì€ ê³„ì† ì¦ê°€ê°’ì´ëœë‹¤.
				String article = sc.nextLine();
				String body = sc.nextLine();
				System.out.printf("ì œëª©:%s\n", article);
				System.out.printf("ë³¸ë¬¸:%s\n", body);
				System.out.printf("%dë²ˆê¸€ì´ìƒì„±ë¬ìŠµë‹ˆë‹¤.\n", id);
			}

			else {
				System.out.println("ì¡´ìž¬í•˜ì§€ ì•ŠëŠ” ëª…ë ¹ì–´ìž…ë‹ˆë‹¤.");
>>>>>>> c6f39e1cb4652a4a82b459d81f88b039fb9a8692
			}
		}
		System.out.println("===í”„ë¡œê·¸ëž¨ì¢…ë£Œ=====");
		
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
