package com.java.exam;

/*
 * 한사람에 대한 정보를 입력하고 출력하는것은 쉬운데
 * 사람수가 많아질수록 엄청 번거로움(내용 다 복붙해서 수정해야함)
 * 학생들 석차 출력하는 코드 만들어 볼 것
 */

public class Ex04 {
	public static void main(String[] args) {

		// 1번 학생
		int kor1 = (int) (Math.random() * 50) + 50;
		int eng1 = (int) (Math.random() * 50) + 50;
		int mat1 = (int) (Math.random() * 50) + 50;
		String name1 = "일길동";
		int sum1 = kor1 + eng1 + mat1;
		double avg1 = sum1 / 3.0;
		int avg1ToInt = (int) avg1;
		int Favg1;

		if ((avg1 - avg1ToInt) < 0.5) {
			Favg1 = avg1ToInt;
		} else {
			Favg1 = avg1ToInt + 1;
		}

		System.out.println("이름: " + name1);
		System.out.print("국어: " + kor1);
		System.out.print(", 영어: " + eng1);
		System.out.println(", 수학: " + mat1);
		System.out.println("합계: " + sum1);
		System.out.println("평균: " + avg1);
		System.out.println("평균 반올림: " + Favg1);
		System.out.println(" ");

		// 2번 학생
		int kor2 = (int) (Math.random() * 50) + 50;
		int eng2 = (int) (Math.random() * 50) + 50;
		int mat2 = (int) (Math.random() * 50) + 50;
		String name2 = "이길동";
		int sum2 = kor2 + eng2 + mat2;
		double avg2 = sum2 / 3.0;
		int avg2ToInt = (int) avg2;
		int Favg2;

		if ((avg2 - avg2ToInt) < 0.5) {
			Favg2 = avg2ToInt;
		} else {
			Favg2 = avg2ToInt + 1;
		}

		System.out.println("이름: " + name2);
		System.out.print("국어: " + kor2);
		System.out.print(", 영어: " + eng2);
		System.out.println(", 수학: " + mat2);
		System.out.println("합계: " + sum2);
		System.out.println("평균: " + avg2);
		System.out.println("평균 반올림: " + Favg2);
		System.out.println(" ");

		// 3번 학생
		int kor3 = (int) (Math.random() * 50) + 50;
		int eng3 = (int) (Math.random() * 50) + 50;
		int mat3 = (int) (Math.random() * 50) + 50;
		String name3 = "삼길동";
		int sum3 = kor3 + eng3 + mat3;
		double avg3 = sum3 / 3.0;
		int avg3ToInt = (int) avg3;
		int Favg3;

		if ((avg3 - avg3ToInt) < 0.5) {
			Favg3 = avg3ToInt;
		} else {
			Favg3 = avg3ToInt + 1;
		}

		System.out.println("이름: " + name3);
		System.out.print("국어: " + kor3);
		System.out.print(", 영어: " + eng3);
		System.out.println(", 수학: " + mat3);
		System.out.println("합계: " + sum3);
		System.out.println("평균: " + avg3);
		System.out.println("평균 반올림: " + Favg3);
		System.out.println(" ");

		String N1, N2, N3;

		// 반 석차 구하기
		if (sum1 < sum2) {
			if (sum1 < sum3) {
				N1 = name1;
				if (sum2 < sum3) {
					N2 = name2;
					N3 = name3;
				} else {
					N2 = name3;
					N3 = name2;
				}
			}

			else {
				N1 = name3;
				N2 = name1;
				N3 = name2;
			}
		} else {
			if (sum2 < sum3) {
				if (sum1 < sum3) {
					N1 = name2;
					N2 = name1;
					N3 = name3;
				} else {
					N1 = name3;
					N2 = name2;
					N3 = name1;
				}
			} else {
				N1 = name3;
				N2 = name2;
				N3 = name1;
			}
		}
		System.out.println("1 등: " + N3);
		System.out.println("2 등: " + N2);
		System.out.println("3 등: " + N1);
	}
}
