
package com.KoreaIT.java.BAM.controller;

import com.KoreaIT.java.BAM.dto.Member;

public abstract class Controller {

	public abstract void doAction(String cmd, String actionMethodName);
	public abstract void makeTestData();
	public static Member loginedMember;//static:article과 member동일한 하나의공공재로 사용하기위해
	public static boolean isLogined() {
		return loginedMember != null;//로그인상태라는뜻
	}
}
