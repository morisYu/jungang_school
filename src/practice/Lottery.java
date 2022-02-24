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
			System.out.println("�ζǹ�ȣ ������");
			System.out.print("�׸� �Է�> ");
			run = scanner.nextInt();
			case2: switch (run) {
			case 1:
				System.out.println("�ζ� ����");

				for (int i = 0; i < lot.length; i++) {
					if (lot[i].name == null) {
						System.out.print("�̸� �Է�> ");
						name = scanner.next();
						System.out.print("��� �Է�> ");
						N = scanner.nextInt();
						lot[i].buy(name, N);
						break;
					}
				}
				break;
			case 2:
				System.out.println("�ζǹ�ȣ Ȯ��");
				System.out.println("�̸� �Է�> ");
				name = scanner.next();
				for (int i = 0; i < lot.length; i++) {
					if (name.equals(lot[i].name)) {
						lot[i].check(name);
						break case2;
					}
				}
				System.out.println("���ų����� �����ϴ�.");
				break;
			case 3:
				break stop;
			}
		}
		System.out.println("���α׷� ����");
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
