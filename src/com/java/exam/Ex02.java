package com.java.exam;

import java.util.Scanner;

/*
 실습 내용
 
 test1.
 @@@@@
 @@@@@
 @@@@@
 @@@@@
 @@@@@
 
 test2.
 @
 @@
 @@@
 @@@@
 @@@@@
 
 test3.
 @@@@@
  @@@@
   @@@
    @@
     @
     
 test4.
        @
       @@@
      @@@@@
     @@@@@@@
    @@@@@@@@@
    
 위의 모양을 화면에 출력
 
 
 조건1. for문 사용
 조건2. System.out.print("@"); 사용
 
  
 */

public class Ex02 {
	public static void main(String[] args) throws Exception {

		boolean BL = true;
		while (BL) {
			System.out.println("원하는 테스트를 선택해주세요");
			System.out.println("test1 / tset2 / test3 / test4 \n  all / quit중 선택");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String inputCh = scan.nextLine();
			if (inputCh.equals("quit")) {
				System.out.println("테스트를 종료합니다.");
				BL = false;
				break;
			}
			System.out.println("원하는 라인 수를 입력해주세요");
			int inputNum = scan.nextInt();
//			System.out.println(inputCh);
//			System.out.println(inputNum);
			if (inputCh.equals("test1")) {
				System.out.println("test1 을 실행합니다.");
				test1(inputNum);
			}

			else if (inputCh.equals("test2")) {
				System.out.println("test2 를 실행합니다.");
				test2(inputNum);
			}

			else if (inputCh.equals("test3")) {
				System.out.println("test3 을 실행합니다.");
				test3(inputNum);
			}

			else if (inputCh.equals("test4")) {
				System.out.println("test4 를 실행합니다.");
				test4(inputNum);
			}

			else if (inputCh.equals("all")) {
				System.out.println("모든 테스트를 진행합니다.");
				test1(inputNum);
				test2(inputNum);
				test3(inputNum);
				test4(inputNum);
			}

			System.out.println("------------------");
			System.out.println("----FINISH--------");
			System.out.println("------------------");

		}

	}

	public static void test1(int a) {
		if (a <= 0) {
			System.out.println("0이하의 숫자는 입력할 수 없습니다.");
		}
		System.out.println("test1 solution!");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

	public static void test2(int a) {
		if (a <= 0) {
			System.out.println("0이하의 숫자는 입력할 수 없습니다.");
		}
		System.out.println("test2 solution!");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

	public static void test3(int a) {
		if (a <= 0) {
			System.out.println("0이하의 숫자는 입력할 수 없습니다.");
		}
		System.out.println("test3 solution!!");
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = a - i; k >= 1; k--) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

	public static void test4(int a) {
		if (a <= 0) {
			System.out.println("0이하의 숫자는 입력할 수 없습니다.");
		}
		System.out.println("test4 solution!!");
		int fn = 2 * a - 1;  // a 번째 줄에 나오는 @ 갯수
		int sn = fn - a;  // 첫번째 줄에 오는 @ 위치(@ 앞에오는 " " 갯수)
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < sn; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i + 1); j++) {
				System.out.print("@");
			}
			System.out.println();
			sn--;
		}
	}
}
