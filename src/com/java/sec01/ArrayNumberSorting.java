package com.java.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumberSorting {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int[] number = new int[input];
		int max = 0;
		int min = 0;

		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();

		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("---------");

		// �ּҰ�
		min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.println(min);
		System.out.println("---------");
		// �ִ밪
		max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		System.out.println(max);

		// Arrays.sort �޼ҵ� ���
		Arrays.sort(number);
		System.out.println(number[0]);
		System.out.println(number[number.length - 1]);
	}

}
