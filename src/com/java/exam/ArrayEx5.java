package com.java.exam;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {

		String[] intArr = new String[10];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		intArr[0] = "ȫ�浿";
		intArr[1] = "û�浿";
		intArr[2] = "��浿";
		System.out.println("�̸��� �Է��ϼ���!!");
		System.out.print("�Է�>");
		intArr[3] = scanner.nextLine();

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
