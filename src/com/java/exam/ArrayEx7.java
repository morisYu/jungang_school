package com.java.exam;

import java.util.Scanner;

public class ArrayEx7 {
	public static void main(String[] args) {

		int[] intArr = new int[3];
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 성적을 입력하세요!!!");

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = scanner.nextInt();
		}
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println("합계: " + sum);
	}
}
