package com.java.sec01;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����ҷ��� q�� �Է��ϼ���");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("Program OFF");
	}
}
