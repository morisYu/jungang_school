package com.java.ex;

public class MemberService {
	String id;
	String password;

	{
		id = "hong";
		password = "12345";
	}

	MemberService() {
		System.out.println("로그인 페이지 \n");
	}

	boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		}
		return false;
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
