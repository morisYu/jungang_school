package com.java.sec01;

public class SwitchStringExample {
	public static void main(String[] args) {
		/* 
		 * switch ������ �Ǽ�Ÿ��(float, double) ���� ��� �Ұ�
		 */
		String position = "����";

		switch (position) {
		case "����":
			System.out.println("700 ����");
			break;
		case "����":
			System.out.println("500 ����");
			break;
		default:
			System.out.println("300 ����");
		}
	}
}
