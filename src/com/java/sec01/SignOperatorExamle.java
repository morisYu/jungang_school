package com.java.sec01;

public class SignOperatorExamle {
	public static void main(String[] args) {
		/*
		 * ����� ������
		 * ������ ����� ��ȣ ��ȯ
		 */
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		short s = 100;
		short result3 = (short)-s; //short Ÿ���� ���� �� int Ÿ������ promotion�Ǳ� ������ casting �ؾ���
		//int result3 = -s;
		System.out.println("result3 = " + result3);

	}

}
