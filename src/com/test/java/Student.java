package com.test.java;

public class Student {
	// 필드
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	char grade;

	// 생성자
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 메소드
	// 성적 합계
	public void sum() {
		sum = kor + eng + mat;
	}

	// 성적 평균
	public void avg() {
		avg = (double) sum / 3.0;
	}

	// 성적 등급(추가)
	public void grade() {
		if (avg >= 90.0) {
			grade = 'A';
		} else if (avg >= 80.0 && avg < 90.0) {
			grade = 'B';
		} else if (avg >= 70.0 && avg < 80.0) {
			grade = 'C';
		} else if (avg >= 60.0 && avg < 70.0) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
}
