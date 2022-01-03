package com.java.sec01;

public class CharExample2 {
	public static void main(String[] args) {
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		c3++; //사칙연산은(c3=c3+1) 안되는데 증감연산은 문자로 잘 인식 됨

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
	    c4++;

		int uniCode = c1; // 유니코드 얻기

		System.out.println(c1 + "\t" + c2 + "\t" + c3);
		System.out.println(c2); //문자 유니코드를 사칙연산하면 정수로 바뀜
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}
}
