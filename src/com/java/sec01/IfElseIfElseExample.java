package com.java.sec01;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 59;
		grade(score);
	}

	public static char grade(int score) {
		char g;
		if (score >= 90) {
			g = 'A';
			System.out.println("������ 90~100 �Դϴ�.");
		} else if (score >= 80) {
			g = 'B';
			System.out.println("������ 80~90 �Դϴ�.");
		} else if (score >= 70) {
			g = 'C';
			System.out.println("������ 70~80 �Դϴ�.");
		} else if (score >= 60) {
			g = 'D';
			System.out.println("������ 60~70 �̸��Դϴ�.");
		} else {
			g = 'F';
			System.out.println("������ 60 �̸��Դϴ�.");
		}

		System.out.println("����� " + g + " �Դϴ�");
		return g;
	}
}
