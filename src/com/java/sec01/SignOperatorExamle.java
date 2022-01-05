package com.java.sec01;

public class SignOperatorExamle {
	public static void main(String[] args) {
		/*
		 * 양수를 음수로
		 * 음수를 양수로 부호 변환
		 */
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		short s = 100;
		short result3 = (short)-s; //short 타입은 연산 후 int 타입으로 promotion되기 때문에 casting 해야함
		//int result3 = -s;
		System.out.println("result3 = " + result3);

	}

}
