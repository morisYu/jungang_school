package com.java.sec01;

public class Ch03Exercise08 {
	public static void main(String[] args) {
		/*
		 * NaN을 검사하는 코드를 작성
		 */
		double x = 5.0;
		double y = 0.0;

		double z = x % y;

		if (Double.isNaN(z)) {
			System.out.println(y + "으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
