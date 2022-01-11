package com.java.sec01;

//�л� ���� ������ �Է¹޾Ƽ� �ְ����� �� ��������� ���� ��

import java.util.Scanner;

public class Chap05Ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentnum = 0;
		int[] scores = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л���  | 2.�����Է�  | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("�л����� �Է����ּ���");
				System.out.println(">>>");
				studentnum = scanner.nextInt();

			} else if (selectNo == 2) {
				System.out.println(studentnum + "���� ������ �Է����ּ���");
				scores = new int[studentnum];
				for (int i = 0; i < studentnum; i++) {
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				System.out.println("** ���� ����Ʈ **");
				for (int i = 0; i < studentnum; i++) {
					System.out.println((i + 1) + " �� �л�: " + scores[i]);
				}

			} else if (selectNo == 4) {
				System.out.println("* ������ �м��մϴ� *");
				int max = scores[0];
				int sum = 0;
				double avg = 0.0;
				int stunum = 0;
				for (int i = 0; i < studentnum; i++) {
					if (max < scores[i]) {
						max = scores[i];
						stunum = i + 1;
					}
				}
				for (int i = 0; i < studentnum; i++) {
					sum += scores[i];
				}
				avg = (double) sum / studentnum;

				System.out.println("�ְ� ����: " + max);
				System.out.println("�ְ� �л�: " + stunum + " ��");
				System.out.println("��� ����: " + halfup(avg));

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Program OFF");
	}

	public static double halfup(double x) {
		int a = (int) (x * 100);
		int b = (int) (x * 10) * 10;
		if (a - b >= 5) {
			x = (double) (b + 10) / 100;
		} else {
			x = (double) b / 100;
		}
		return x;
	}
}
