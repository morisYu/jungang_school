package com.java.sec01;

public class Ch03Exercise08 {
	public static void main(String[] args) {
		/*
		 * NaN�� �˻��ϴ� �ڵ带 �ۼ�
		 */
		double x = 5.0;
		double y = 0.0;

		double z = x % y;

		if (Double.isNaN(z)) {
			System.out.println(y + "���� ���� �� �����ϴ�.");
		} else {
			double result = z + 10;
			System.out.println("���: " + result);
		}
	}
}
