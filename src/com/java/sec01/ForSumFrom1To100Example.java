package com.java.sec01;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int I = 5;
		int F = 15;
		for (int i = I; i <= F; i++) {
			sum += i; // sum = sum + 1
		}
		System.out.println(sum);
		System.out.println("�ٸ� ��� ���");
		int sumcal = (I + F) * (F - I + 1) / 2;
		System.out.println(sumcal);
	}
}
