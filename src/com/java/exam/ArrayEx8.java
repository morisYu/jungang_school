package com.java.exam;

import java.util.Scanner;

public class ArrayEx8 {
	public static void main(String[] args) {

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] mat = new int[3];
		int sum = 0;
		double avg = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ���!!");
		name[0] = scanner.nextLine();
		System.out.print("��������> ");
		kor[0] = scanner.nextInt();
		System.out.print("��������> ");
		eng[0] = scanner.nextInt();
		System.out.print("��������> ");
		mat[0] = scanner.nextInt();
		System.out.println();

		sum = kor[0] + eng[0] + mat[0];
		avg = sum / 3;

		System.out.println("�л��̸�: " + name[0]);
		System.out.println("����: " + kor[0] + ", ����: " + eng[0] + ", ����: " + mat[0]);
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);

	}
}
