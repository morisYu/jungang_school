package examPractice;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNo = 0;
		int[] scores = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");

			String selectNo = scanner.next();

			if (selectNo.equals("1")) {

				System.out.print("학생수> ");
				studentNo = scanner.nextInt();
				scores = new int[studentNo];

			} else if (selectNo.equals("2")) {

				for (int i = 0; i < studentNo; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo.equals("3")) {

				for (int i = 0; i < studentNo; i++) {
					System.out.println("scores[" + i + "]: "+scores[i]);
				}

			} else if (selectNo.equals("4")) {
				
				int sum = 0;
				double avg = 0;
				int max;
				
				try {
					max = scores[0];
				}catch(Exception e) {
					System.out.println("학생수를 입력하세요");
					continue;
				}
				
				for (int i = 0; i < studentNo; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}

				avg = sum / studentNo;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);

			} else if (selectNo.equals("5")) {
				run = false;
			} else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}

}
