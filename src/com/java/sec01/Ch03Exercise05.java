package com.java.sec01;

public class Ch03Exercise05 {
public static void main(String[] args) {
	/*
	 * 숫자 356을 입력했을 때 십의자리 이하를 버리고 300이 출력되도록
	 * 산술연산만 사용해서 코드 작성
	 */
	int value=356;
	int result=value/100*100; //value를 100으로 나누어서 몫이 100의 자리수(3)가 남고, 여기에 100을 곱함.
	System.out.println(result);
}
}
