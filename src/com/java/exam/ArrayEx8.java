package com.java.exam;

import java.util.Scanner;

public class ArrayEx8 {
	public static void main(String[] args) {

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] mat = new int[3];
		int sum = 0;
		double avg = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요!!");
		name[0] = scanner.nextLine();
		System.out.print("국어점수> ");
		kor[0] = scanner.nextInt();
		System.out.print("영어점수> ");
		eng[0] = scanner.nextInt();
		System.out.print("수학점수> ");
		mat[0] = scanner.nextInt();
		System.out.println();

		sum = kor[0] + eng[0] + mat[0];
		avg = sum / 3;

		System.out.println("학생이름: " + name[0]);
		System.out.println("국어: " + kor[0] + ", 영어: " + eng[0] + ", 수학: " + mat[0]);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);

	}
}
