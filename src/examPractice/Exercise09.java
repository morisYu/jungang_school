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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");

			String selectNo = scanner.next();

			if (selectNo.equals("1")) {

				System.out.print("�л���> ");
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
					System.out.println("�л����� �Է��ϼ���");
					continue;
				}
				
				for (int i = 0; i < studentNo; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}

				avg = sum / studentNo;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);

			} else if (selectNo.equals("5")) {
				run = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		}
		System.out.println("���α׷� ����");
	}

}
