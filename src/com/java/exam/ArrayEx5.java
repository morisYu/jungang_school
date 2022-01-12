package com.java.exam;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {

		String[] intArr = new String[10];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		intArr[0] = "홍길동";
		intArr[1] = "청길동";
		intArr[2] = "백길동";
		System.out.println("이름을 입력하세요!!");
		System.out.print("입력>");
		intArr[3] = scanner.nextLine();

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
