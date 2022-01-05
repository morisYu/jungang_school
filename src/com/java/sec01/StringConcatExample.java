package com.java.sec01;

public class StringConcatExample {
	public static void main(String[] args) {
		/*
		 * 연산 순서에 따라 String 타입이 앞에 있으면 뒤에 있는 숫자도 String 타입으로 변환되어 문자열이 합쳐짐
		 * 숫자가 앞에 오는 경우 숫자를 먼저 연산하고 String 타입과 연산 시 타입이 변환되어 문자열이 합쳐짐
		 */
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + "특징";
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0; //"JDK"와 3이 연산되면서 숫자 3이 문자열로 변환, "JDK3"이 3.0과 연산되면서 3.0이 문자열로 변환
		String str4 = 3 + 3.0 + "JDK"; //3과 3.0이 연산되면서 6.0이 되고, 6.0과 "JDK"가 연산되면서 6.0이 문자열로 변환됨
		System.out.println(str3);
		System.out.println(str4);
	}
}
