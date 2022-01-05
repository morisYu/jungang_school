package com.java.sec01;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // literal 자체가 연산이 되어서 결과값인 유니코드가 c1에 대입됨
		char c2 = 'A';
		// char c3 = c2 + 1; // c2(변수)와 1의 연산 결과는 "int" 타입이기 때문에 오류가 발생함
		char c3 = (char) (c2 + 1); // casting 해야 오류가 생기지 않음
		int c4 = 67;

		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println((int) c2); // c2(문자 'A')의 유니코드를 출력
		System.out.println("c3: " + c3);
		System.out.println((char) c4); // c4(숫자 67)을 문자로 변환하여 출력
	}
}
