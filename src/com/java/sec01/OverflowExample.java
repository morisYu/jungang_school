package com.java.sec01;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // 결과값은 int 타입의 범위를 벗어나기 때문에 전혀 다른 값이 출력됨
		long a = (long) x * y; // 허용 범위가 넓은 long 타입으로 casting 해야 정상적으로 출력됨

		System.out.println(z);
		System.out.println(a);

	}
}
