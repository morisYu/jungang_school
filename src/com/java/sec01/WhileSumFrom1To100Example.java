package com.java.sec01;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 100) {
			sum += i++; // sum�� i�� ���ؼ� ���� �� i�� 1 ����
		}
		System.out.println(sum);
	}
}
