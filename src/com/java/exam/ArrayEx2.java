package com.java.exam;

public class ArrayEx2 {
	public static void main(String[] args) {

		long[] byteArr = { 1, 5, 55, 4, 30, 20000000000L };
		System.out.println(byteArr.length);

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}

	}
}
