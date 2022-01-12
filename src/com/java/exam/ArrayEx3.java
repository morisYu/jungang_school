package com.java.exam;

public class ArrayEx3 {
	public static void main(String[] args) {

		int[] intArr = { 1, 5, 55, 4, 30, 21 };

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = intArr[i] + 100;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}
}
