package com.java.sec01;

/*
 * 10 이하인 자연수 x, y 에 대해 "4x + 5Y =60"을 만족하는 x, y 찾기
 */

public class Chap04Ex05 {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		System.out.println("Program OFF");
	}
}
