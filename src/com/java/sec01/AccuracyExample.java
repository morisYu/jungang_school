package com.java.sec01;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number * pieceUnit; // �ε��Ҽ��� Ÿ��(float, double)�� ��Ȯ�� ����� �����.

		System.out.println("��� 1 ������");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");

		int totalPiece = apple * 10;
		int temp = totalPiece - number; // ��Ȯ�� ����� �� ���� int Ÿ������ ����� �� ������
		double result2 = temp / 10.0; // �Ǽ�(float, double) Ÿ������ ��ȯ�ؾ� ��.
		System.out.println(result2);
	}
}
