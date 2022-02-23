package exam20220223;

import java.util.Scanner;

public class Exam220223 {

	private static ScoreThread[] scoreThread;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = 0;
		while(true) {
			System.out.println("����ó�� ���α׷�");
			System.out.print("�л��� �Է�> ");

			try {
				N = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("�л� ���� �ٽ� �Է��ϼ���.");
				scanner = new Scanner(System.in);
				continue;
			}

			scoreThread = new ScoreThread[N];
			break;
		}
		
		inputData(N);

		outputData(N);

		ranking(N);

		pass(N);
	}

	// ���� �Է�
	static void inputData(int N) {

		String name;
		int kor;
		int eng;
		int mat;

		for (int i = 0; i < N; i++) {

				try {
					System.out.print("�л��̸�> ");
					name = scanner.next();
					System.out.print("�����> ");
					kor = scanner.nextInt();
					System.out.print("�����> ");
					eng = scanner.nextInt();
					System.out.print("���м���> ");
					mat = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("�̸��� Ȯ���ϼ���");
					return;
				}

			scoreThread[i] = new ScoreThread(name, kor, eng, mat);
		}
	}

	// ���� ���
	static void outputData(int N) {

		for (int i = 0; i < N; i++) {
			if (scoreThread[i].name != null) {
				System.out.println("�̸�: " + scoreThread[i].name + " ����: " + scoreThread[i].kor + " ����: "
						+ scoreThread[i].eng + " ����: " + scoreThread[i].mat);
			}
		}
	}

	// ���� ���
	static void ranking(int N) {

		for (int i = 0; i < N - 1; i++) {
			int max = scoreThread[i].sum;
			int tmp = 0;
			int count = i;
			for (int j = i + 1; j < N; j++) {
				if (max < scoreThread[j].sum) {
					max = scoreThread[j].sum;
					count = j;
				}
			}
			tmp = scoreThread[i].sum;
			scoreThread[i].sum = max;
			scoreThread[count].sum = tmp;
		}

		for (int i = 0; i < N; i++) {
			System.out.println("���� " + scoreThread[i].name);
		}
	}

	// �հ�, ���հ� �Ǻ�
	static void pass(int N) {
		double totalAvg;
		double totalSum = 0;
		for (int i = 0; i < N; i++) {
			totalSum += scoreThread[i].avg;
		}

		totalAvg = totalSum / 3.0;
		System.out.println("��ü���: " + totalAvg);

		for (int i = 0; i < N; i++) {
			if (scoreThread[i].avg >= totalAvg) {
				System.out.println(scoreThread[i].name + " ���: " + scoreThread[i].avg + " : �հ�");
			} else {
				System.out.println(scoreThread[i].name + " ���: " + scoreThread[i].avg + " : ���հ�");
			}
		}
	}
}

// �л� ���� �Է�
class ScoreThread {

	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	char grade;

	public ScoreThread(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = (double) (sum / 3.0);

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80 && avg < 90) {
			grade = 'B';
		} else if (avg >= 70 && avg < 80) {
			grade = 'C';
		} else if (avg >= 60 && avg < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
}
