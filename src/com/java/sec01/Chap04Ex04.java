package com.java.sec01;

/*
     �ֻ��� 2 ���� ������ �� �ֻ����� ���� ���� ���� 5 �� �� ���ߴ� �ڵ�
 */

public class Chap04Ex04 {
	public static void main(String[] args) {
		boolean dice = true;
		while (dice) {
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			if (d1 + d2 == 5) {
				dice = false;
			}
			System.out.println("(" + d1 + " , " + d2 + ")");
		}
	}
}
