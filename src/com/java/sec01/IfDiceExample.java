package com.java.sec01;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1);
		if (num == 1) {
			System.out.println("1 ���� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println("2 ���� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println("3 ���� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println("4 ���� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println("5 ���� ���Խ��ϴ�.");
		} else {
			System.out.println("6 ���� ���Խ��ϴ�.");
		}
		System.out.println("-----------------");
		System.out.println("�߰� �ζǹ�ȣ ������ �ǽ�");
		lottory();
	}

	public static void lottory() {

		int[] lott = new int[6];
		for (int i = 0; i < 6; i++) {
			lott[i] = (int) (Math.random() * 45 + 1);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(lott[i] + "  ");
		}
		System.out.println("+ " + lott[5]);
	}
}
