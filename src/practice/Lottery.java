package practice;

import java.util.Scanner;

public class Lottery {
	private static Lotto[] lot;

	public static void main(String[] args) {
		lot = new Lotto[10];

		for (int i = 0; i < lot.length; i++) {
			lot[i] = new Lotto();
		}

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int run = 0;
		String name;
		int N;

		stop: while (true) {
			System.out.println("로또번호 생성기");
			System.out.print("항목 입력> ");
			run = scanner.nextInt();
			case2: switch (run) {
			case 1:
				System.out.println("로또 구매");

				for (int i = 0; i < lot.length; i++) {
					if (lot[i].name == null) {
						System.out.print("이름 입력> ");
						name = scanner.next();
						System.out.print("장수 입력> ");
						N = scanner.nextInt();
						lot[i].buy(name, N);
						break;
					}
				}
				break;
			case 2:
				System.out.println("로또번호 확인");
				System.out.println("이름 입력> ");
				name = scanner.next();
				for (int i = 0; i < lot.length; i++) {
					if (name.equals(lot[i].name)) {
						lot[i].check(name);
						break case2;
					}
				}
				System.out.println("구매내역이 없습니다.");
				break;
			case 3:
				break stop;
			}
		}
		System.out.println("프로그램 종료");
	}
}

class Lotto {
	String name;
	int[][] number;

	public Lotto() {
	}

	public void buy(String name, int N) {
		this.name = name;
		number = new int[N][7];
		for (int i = 0; i < N; i++) {
			re: while (true) {
				for (int j = 0; j < 7; j++) {
					number[i][j] = (int) (Math.random() * 46 + 1);
				}
				for (int k = 0; k < 6; k++) {
					for (int m = k + 1; m < 7; m++) {
						if (number[i][k] == number[i][m]) {
							continue re;
						}
					}
				}
				break;
			}

		}
	}

	public void check(String name) {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
	}
}
