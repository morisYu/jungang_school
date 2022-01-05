package com.java.sec01;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "Infinity";
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;

		if (Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		} else if (Double.isInfinite(val)) {
			System.out.println("Infinity�� �ԷµǾ� ó���� �� ����");
			val = 1.0;
		}

		currentBalance += val;
		System.out.println(currentBalance);

	}
}
