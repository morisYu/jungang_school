package com.java.sec07;

import java.util.Scanner;

public class ScoreArray {
	int number;
	Scanner scanner = new Scanner(System.in);
	int[] score;
	String[] name;

	ScoreArray(int number) {
		this.number = number;
		score = new int[number];
		name = new String[number];
		System.out.println("*****         ��� ������ Method         *****");
		System.out.println("scoreInput() / scoreSorting() / nameInput()");
		System.out.println("======================");
	}

	void nameInput() {
		System.out.println(number + " ���� �̸��� �Է��ϼ���.");
		for (int i = 0; i < number; i++) {
			System.out.print("�Է� > ");
			name[i] = scanner.next();
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " �� ����= " + name[i]);
		}
		System.out.println("======================");
	}

	void scoreInput() {
		System.out.println(number + " ���� ������ �Է��ϼ���.");
		for (int i = 0; i < number; i++) {
			System.out.print("�Է� > ");
			score[i] = scanner.nextInt();
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " �� ����= " + score[i]);
		}
		System.out.println("======================");
	}

	void scoreSorting() {
		if (score[0] == 0 || name[0] == null) {
			System.out.println("�̸�/������ ���� �Է��ϼ���.");
			return;
		}
		for (int i = 0; i < number; i++) {
			int max = score[i];
			int count = i;
			for (int j = i; j < number; j++) {
				if (max < score[j]) {
					max = score[j];
					count = j;
				}
			}
			int tmp = score[i];
			score[i] = max;
			score[count] = tmp;

			String tmpS = name[i];
			name[i] = name[count];
			name[count] = tmpS;
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " �� �̸�: " + name[i] + " / ����: " + score[i]);
		}
		System.out.println("======================");
	}
}
