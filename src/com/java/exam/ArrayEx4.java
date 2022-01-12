package com.java.exam;

public class ArrayEx4 {
	public static void main(String[] args) {

		int[] intArr = new int[10];

		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;

		intArr[1] = 500;

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
