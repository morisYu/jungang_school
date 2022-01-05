package com.java.sec01;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "Infinity";
		double val = Double.valueOf(userInput); //double 타입의 숫자로 변환(NaN, Infinity만 가능)
		
		double currentBalance=10000.0;
		
		currentBalance+=val; //
		System.out.println(currentBalance);
		
	}
}
