package com.java.sec01;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number * pieceUnit; // 부동소수점 타입(float, double)은 정확한 계산이 어려움.

		System.out.println("사과 1 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");

		int totalPiece = apple * 10;
		int temp = totalPiece - number; // 정확한 계산을 할 때는 int 타입으로 계산을 한 다음에
		double result2 = temp / 10.0; // 실수(float, double) 타입으로 변환해야 함.
		System.out.println(result2);
	}
}
