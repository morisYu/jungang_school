package com.java.exam02;

public class Student {
	String name; // �л��� �̸� �ʵ�
	int kor; // �л��� ����� �ʵ�
	int eng; // �л��� ����� �ʵ�
	int mat; // �л��� ���м��� �ʵ�
	int sum; // �л��� ����(����, ����, ����) �� �� �հ� �ʵ�
	double avg; // �л��� ����(����, ����, ����) �� ��� �ʵ�

	// ������
	public Student() {

	}

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// �޼ҵ�
	public void sum() {
		System.out.println("sum() �޼ҵ� ����");
		this.sum = kor + eng + mat;
	}

	public void avg() {
		System.out.println("avg() �޼ҵ� ����");
		this.avg = (double) sum / 3.0;
	}
}
