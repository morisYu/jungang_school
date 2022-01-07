package com.java.exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int var1 = 10000; // 성인 입장료
		int var2 = 5000; // 청소년 입장료
		int var1count = 1;// 성인 인원수
		int var2count = 1;// 청소년 인원수
		int var3 = 2;// 낮: 1, 밤: 2 (50 % 할인)
		int total = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("성인 인원수를 알려주세요");
		var1count = scan.nextInt();
		System.out.println("청소년 인원수를 알려주세요");
		var2count = scan.nextInt();

		total = var1 * var1count + var2 * var2count;

		if (var3 == 2) {
			total = total / 2;
		}
		String str = Integer.toString(total);
		System.out.println("총 입장료: " + total);
		System.out.println(str.length());
	}
}
