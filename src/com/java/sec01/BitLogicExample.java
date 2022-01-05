package com.java.sec01;

public class BitLogicExample {
	public static void main(String[] args) {
		int a = 45;
		int b = 25;
		int c = 45 & 25;
		int d = 45 | 25;
		int e = 45 ^ 25;
		int f = ~45;
		System.out.println("a = " + toBinaryString(a));
		System.out.println("b = " + toBinaryString(b));
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("->" + toBinaryString(c));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("->" + toBinaryString(d));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("->" + toBinaryString(e));
		System.out.println("~45 = " + (~45));
		System.out.println("->" + toBinaryString(f));
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
