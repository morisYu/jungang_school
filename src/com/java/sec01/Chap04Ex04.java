package com.java.sec01;

/*
     주사위 2 개를 던져서 두 주사위의 눈을 더한 값이 5 일 때 멈추는 코드
 */

public class Chap04Ex04 {
	public static void main(String[] args) {
		boolean dice = true;
		while (dice) {
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			if (d1 + d2 == 5) {
				dice = false;
			}
			System.out.println("(" + d1 + " , " + d2 + ")");
		}
	}
}
