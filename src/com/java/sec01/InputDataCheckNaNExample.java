package com.java.sec01;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "Infinity";
		double val = Double.valueOf(userInput); //double Ÿ���� ���ڷ� ��ȯ(NaN, Infinity�� ����)
		
		double currentBalance=10000.0;
		
		currentBalance+=val; //
		System.out.println(currentBalance);
		
	}
}
