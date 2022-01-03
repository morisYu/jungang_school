package com.java.sec01;

public class LongeExample {
	public static void main(String[] args) {
		long var1 = 10; // int=>long 자동 형변환
		long var2 = 20l;
		// long var3 = 1000000000000; //숫자만 넣으면 int로 인식이 되어서 int 범위를 넘어서면 컴파일 에러가 남
		long var4 = 1000000000000l; // long 으로 표현하고 싶으면 숫자 뒤에 'l'또는 'L'을 붙여줘야 한다.

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
