package com.java.sec01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println("s2 ������ Student ��ü�� �����մϴ�.");
		System.out.println(s2);

		s1.name = "�谳��";
		s1.count = 10;
		s1.check();

	}
}
