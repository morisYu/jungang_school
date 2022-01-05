package com.java.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------------------");
		x++; // x = x + 1 --> 11 (후위 증감 연산자)
		++x; // x = x + 1 --> 12 (전위 증감 연산자)
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		y--; // y = y - 1 --> 9
		--y; // y = y - 1 --> 8
		System.out.println("y= " + y);

		System.out.println("--------------------------");
		z = x++; // z에 x를 대입 후 (z = 12), x에 1 더해줌(x=13)
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		z = ++x; // x에 1을 더한 후(x=14) z에 x를 대입(z=14)
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		z = ++x + y++; // x에 1을 더한 후(x=15) y와 연산한 값을 z에 대입(z=23) 후 y에 1을 더해줌(y=9)
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
