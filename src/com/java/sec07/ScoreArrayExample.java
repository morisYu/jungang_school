package com.java.sec07;

import java.util.Scanner;

public class ScoreArrayExample {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("* ������ �������� �����մϴ�. *");
			System.out.println();
			System.out.println("�л� ���� �Է��ϼ���");
			System.out.println("�Է� > ");
			ScoreArray test = new ScoreArray(scanner.nextInt());
			while (true) {
				System.out.println("�޴��� �����ϼ���.");
				System.out.println("1. �̸��Է� / 2. �����Է� / 3. ���İ�� / 4. ����");

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
				default:
					System.out.println("1, 2, 3 �߿� �����ϼ���.");
				}
			}

		}

	}
}
