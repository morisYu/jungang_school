package com.java.sec07;

import java.util.Scanner;

public class ScoreArrayExample {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		out: while (true) {
			System.out.println("* ������ �������� �����մϴ�. *");
			System.out.println();
			System.out.println("�л� ���� �Է��ϼ���");
			System.out.print("�Է� > ");
			ScoreArray test = new ScoreArray(scanner.nextInt());
			while (true) {
				System.out.println("�޴��� �����ϼ���.");
				System.out.println("1. �̸��Է� / 2. �����Է� / 3. ���İ�� / 4. ����");
				System.out.print("�Է� > ");

				int menu = scanner.nextInt();
				switch (menu) {
				case 1:
					test.nameInput();
					break;
				case 2:
					test.scoreInput();
					break;
				case 3:
					test.scoreSorting();
					break;
				case 4:
					break out;
				default:
					System.out.println("1, 2, 3, 4 �߿� �����ϼ���.");
				}
			}

		}
		System.out.println("Program OFF");

	}
}
