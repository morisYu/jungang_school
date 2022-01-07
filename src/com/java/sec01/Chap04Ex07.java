package com.java.sec01;

/*
 * whlie문과 Scanner를 이용해서 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
 */

import java.util.Scanner;

public class Chap04Ex07 {
	public static void main(String[] args) {
		int money = 0;
		boolean run = true;
		OUT: while (run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String menu = scan.nextLine();
			switch (menu) {
			case "1":
				System.out.println("예금액을 입력해주세요> ");
				int cashIn = scan.nextInt();
				money += cashIn;
				System.out.println("입금이 완료되었습니다.");
				System.out.println("잔고: " + money + " 원");
				break;
			case "2":
				System.out.println("출금액을 입력해주세요> ");
				int cashOut = scan.nextInt();
				money -= cashOut;
				System.out.println("출금이 완료되었습니다.");
				System.out.println("잔고: " + money + " 원");
				break;
			case "3":
				System.out.println("잔고: " + money + " 원");
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				break OUT;
			default:
				System.out.println("메뉴를 다시 선택해주세요.");
			}

		}
	}
}
