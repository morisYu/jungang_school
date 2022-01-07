package com.java.exam;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("12345");
		System.out.println("12345");
		System.out.print("a");
		System.out.print("b");
		System.out.println("\n");
		System.out.println();
		System.out.println("cd");

		System.out.println("cd : " + (5 * 5));
		System.out.println("cd : " + (5 * 5) + " ef");

		int kor = 100;
		int eng = 90;
		int mat = 70;
		System.out.println("합계: " + kor + eng + mat); // 연산 방향에 따라 연산이 되면서 숫자가 문자열로 변환된 후 결합됨
		System.out.println("합계: " + (kor + eng + mat)); // 괄호 안에 있는 숫자는 우선 산술연산 되고 문자열 결합됨

		System.out.println("☏ \t" + "⑬\t" + "Φ\t"); // 특수문자도 출력 가능("자음+한자" 입력)
		System.out.println("안녕\n 하세요");

	}
}
