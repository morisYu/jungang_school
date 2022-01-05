package com.java.sec01;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(100, 100);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Overflow");
		}
	}

	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("Over");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("Over");
			}
		}
		return left + right;
	}
}
