package com.java.sec01;

/*
 * 10 ������ �ڿ��� x, y �� ���� "4x + 5Y =60"�� �����ϴ� x, y ã��
 */

public class Chap04Ex05 {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		System.out.println("Program OFF");
	}
}
