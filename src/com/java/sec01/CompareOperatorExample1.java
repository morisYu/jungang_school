package com.java.sec01;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 < num2);
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2;
		System.out.println("result4=" + result4);

		System.out.println('A' == 65);
		System.out.println(3 == 3.0);
		System.out.println(0.1 == 0.1f); // 부동소수점 타입(왼쪽은 double, 오른쪽은 float 타입)은 소수점을 정확히 표현할 수 없어서 비교를 하기 위해서는 양쪽 다 같은 타입으로 변환을 해야함
	}

}
