package com.test.java;

public class Student2 {
	// �ʵ�
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	char grade;

	// ������
	public Student2(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// �޼ҵ�
	// ���� �հ�
	public void sum() {
		sum = kor + eng + mat;
	}

	// ���� ���
	public void avg() {
		avg = (double) sum / 3.0;
	}

	// ���� ���(�߰�)
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
	
	// ��ü ���
	public void printResult() {
		System.out.println("�л� �̸�: " + name);
		System.out.println("���� ����: " + kor);
		System.out.println("���� ����: " + eng);
		System.out.println("���� ����: " + mat);
		System.out.println("���� �հ�: " + sum);
		System.out.println("���� ���: " + avg);
		System.out.println("���� ���: " + grade);
	}
}
