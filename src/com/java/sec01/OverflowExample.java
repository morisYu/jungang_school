package com.java.sec01;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // ������� int Ÿ���� ������ ����� ������ ���� �ٸ� ���� ��µ�
		long a = (long) x * y; // ��� ������ ���� long Ÿ������ casting �ؾ� ���������� ��µ�

		System.out.println(z);
		System.out.println(a);

	}
}
