package com.java.exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int var1 = 10000; // ���� �����
		int var2 = 5000; // û�ҳ� �����
		int var1count = 1;// ���� �ο���
		int var2count = 1;// û�ҳ� �ο���
		int var3 = 2;// ��: 1, ��: 2 (50 % ����)
		int total = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ο����� �˷��ּ���");
		var1count = scan.nextInt();
		System.out.println("û�ҳ� �ο����� �˷��ּ���");
		var2count = scan.nextInt();

		total = var1 * var1count + var2 * var2count;

		if (var3 == 2) {
			total = total / 2;
		}
		String str = Integer.toString(total);
		System.out.println("�� �����: " + total);
		System.out.println(str.length());
	}
}
