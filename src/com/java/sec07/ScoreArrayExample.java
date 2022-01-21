package com.java.sec07;

import java.util.Scanner;

public class ScoreArrayExample {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("* 점수를 내림차순 정렬합니다. *");
			System.out.println();
			System.out.println("학생 수를 입력하세요");
			System.out.println("입력 > ");
			ScoreArray test = new ScoreArray(scanner.nextInt());
			while (true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("1. 이름입력 / 2. 점수입력 / 3. 정렬결과 / 4. 종료");

				int menu = scanner.nextInt();
				switch (menu) {
				case 1:
					test.nameInput();
					break;
				case 2:
					test.scoreInput();
					break;
				case 3:
					test.scoreSorting();
					break;
				default:
					System.out.println("1, 2, 3 중에 선택하세요.");
				}
			}

		}

	}
}
