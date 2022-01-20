package com.java.ex;

import java.util.Scanner;

public class Chap06Ex15 {
	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.println("3 번 틀렸습니다.");
				break;
			}
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id입력> ");
			String id = scanner.next();
			System.out.print("password입력> ");
			String password = scanner.next();
			boolean result = memberservice.login(id, password);
			if (result) {
				System.out.println("로그인 되었습니다.");
				memberservice.logout("hong");
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
		}
	}
}
