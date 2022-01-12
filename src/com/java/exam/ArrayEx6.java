package com.java.exam;

import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {

		int[] intArr = new int[3];

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 성적을 입력하세요!!!");
		intArr[0] = scanner.nextInt();
		intArr[1] = scanner.nextInt();
		intArr[2] = scanner.nextInt();

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
