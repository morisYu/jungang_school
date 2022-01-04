package com.java.sec01;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3=byteValue1+byteValue2; //피연산자를 4byte 단위로 저장하기 때문에 연산 결과는
		// byte타입이 될 수 없음(int타입으로 변환되어 연산이 됨)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue1+charValue2; //각 문자는 int 타입인 유니코드로 저장이 되기 때문에 연산 결과는 int 타입이 됨
		int intValue2 = charValue1 + charValue2;

		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 연산 결과는 실수이지만 모든 피연산자가 int 타입이기 했기 때문에 연산 결과값도 int 타입으로 나옴
		System.out.println(intValue4);

		int intValue5 = 10;
		// int intValue6=10/4.0; //피연산자에 실수가 포함되어있기 때문에 int 타입이 실수 타입으로 변환된 후 연산이 되기 때문에
		// 연산 결과는 실수 타입(float, double)으로 나옴
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

	}
}
