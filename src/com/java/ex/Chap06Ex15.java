package com.java.ex;

import java.util.Scanner;

public class Chap06Ex15 {
	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.println("3 �� Ʋ�Ƚ��ϴ�.");
				break;
			}
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.print("id�Է�> ");
			String id = scanner.next();
			System.out.print("password�Է�> ");
			String password = scanner.next();
			boolean result = memberservice.login(id, password);
			if (result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				memberservice.logout("hong");
			} else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			}
		}
	}
}
