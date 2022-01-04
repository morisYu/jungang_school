package com.java.sec01;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		int num5 = 123456780;

		float num3 = num2; // 자동 형변환(정수 타입을 실수 타입으로 형변환 할 때 정밀도 손실을 피해야 함)
		/*
		 * float : 부호(1bit)+지수(8bit)+가수(23bit)로 표현이 되는데 123456780은 23bit로 표현이 불가능하기 때문에
		 * 근사치로 변환되면서 정밀도 손실이 발생함 따라서, float이 아닌 double(가수부분이 52bit)로 형변환을 하면 정밀도 손실을 피할
		 * 수 있음
		 */
		num2 = (int) num3; // 강제 형변환

		double num4 = num5; // int 타입을 double 타입으로 변환하면 정밀도 손실 없음
		num5 = (int) num4;

		int result = num1 - num2;
		System.out.println(result);
		int result2 = num1 - num5;
		System.out.println(result2);

	}
}
