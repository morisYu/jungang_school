package com.java.exam02;

public class Student {
	String name; // 학생의 이름 필드
	int kor; // 학생의 국어성적 필드
	int eng; // 학생의 영어성적 필드
	int mat; // 학생의 수학성적 필드
	int sum; // 학생의 성적(국어, 영어, 수학) 의 총 합계 필드
	double avg; // 학생의 성적(국어, 영어, 수학) 의 평균 필드

	// 생성자
	public Student() {

	}

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 메소드
	public void sum() {
		System.out.println("sum() 메소드 실행");
		this.sum = kor + eng + mat;
	}

	public void avg() {
		System.out.println("avg() 메소드 실행");
		this.avg = (double) sum / 3.0;
	}
}
