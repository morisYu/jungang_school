package exam20220223;

import java.util.Scanner;

public class Exam220223 {

	private static ScoreThread[] scoreThread;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = 0;
		while(true) {
			System.out.println("성적처리 프로그램");
			System.out.print("학생수 입력> ");

			try {
				N = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("학생 수를 다시 입력하세요.");
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

	// 정보 입력
	static void inputData(int N) {

		String name;
		int kor;
		int eng;
		int mat;

		for (int i = 0; i < N; i++) {

				try {
					System.out.print("학생이름> ");
					name = scanner.next();
					System.out.print("국어성적> ");
					kor = scanner.nextInt();
					System.out.print("영어성적> ");
					eng = scanner.nextInt();
					System.out.print("수학성적> ");
					mat = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("이름을 확인하세요");
					return;
				}

			scoreThread[i] = new ScoreThread(name, kor, eng, mat);
		}
	}

	// 정보 출력
	static void outputData(int N) {

		for (int i = 0; i < N; i++) {
			if (scoreThread[i].name != null) {
				System.out.println("이름: " + scoreThread[i].name + " 국어: " + scoreThread[i].kor + " 영어: "
						+ scoreThread[i].eng + " 수학: " + scoreThread[i].mat);
			}
		}
	}

	// 순위 계산
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
			System.out.println("순위 " + scoreThread[i].name);
		}
	}

	// 합격, 불합격 판별
	static void pass(int N) {
		double totalAvg;
		double totalSum = 0;
		for (int i = 0; i < N; i++) {
			totalSum += scoreThread[i].avg;
		}

		totalAvg = totalSum / 3.0;
		System.out.println("전체평균: " + totalAvg);

		for (int i = 0; i < N; i++) {
			if (scoreThread[i].avg >= totalAvg) {
				System.out.println(scoreThread[i].name + " 평균: " + scoreThread[i].avg + " : 합격");
			} else {
				System.out.println(scoreThread[i].name + " 평균: " + scoreThread[i].avg + " : 불합격");
			}
		}
	}
}

// 학생 정보 입력
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
