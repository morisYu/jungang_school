package com.java.exam;

import java.util.Scanner;

/*
 �ǽ� ����
 
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
    
 ���� ����� ȭ�鿡 ���
 
 
 ����1. for�� ���
 ����2. System.out.print("@"); ���
 
  
 */

public class Ex02 {
	public static void main(String[] args) throws Exception {

		boolean BL = true;
		while (BL) {
			System.out.println("���ϴ� �׽�Ʈ�� �������ּ���");
			System.out.println("test1 / tset2 / test3 / test4 \n  all / quit�� ����");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String inputCh = scan.nextLine();
			if (inputCh.equals("quit")) {
				System.out.println("�׽�Ʈ�� �����մϴ�.");
				BL = false;
				break;
			}
			System.out.println("���ϴ� ���� ���� �Է����ּ���");
			int inputNum = scan.nextInt();
//			System.out.println(inputCh);
//			System.out.println(inputNum);
			if (inputCh.equals("test1")) {
				System.out.println("test1 �� �����մϴ�.");
				test1(inputNum);
			}

			else if (inputCh.equals("test2")) {
				System.out.println("test2 �� �����մϴ�.");
				test2(inputNum);
			}

			else if (inputCh.equals("test3")) {
				System.out.println("test3 �� �����մϴ�.");
				test3(inputNum);
			}

			else if (inputCh.equals("test4")) {
				System.out.println("test4 �� �����մϴ�.");
				test4(inputNum);
			}

			else if (inputCh.equals("all")) {
				System.out.println("��� �׽�Ʈ�� �����մϴ�.");
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
			System.out.println("0������ ���ڴ� �Է��� �� �����ϴ�.");
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
			System.out.println("0������ ���ڴ� �Է��� �� �����ϴ�.");
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
			System.out.println("0������ ���ڴ� �Է��� �� �����ϴ�.");
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
			System.out.println("0������ ���ڴ� �Է��� �� �����ϴ�.");
		}
		System.out.println("test4 solution!!");
		int fn = 2 * a - 1;  // a ��° �ٿ� ������ @ ����
		int sn = fn - a;  // ù��° �ٿ� ���� @ ��ġ(@ �տ����� " " ����)
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
