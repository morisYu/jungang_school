package com.java.sec01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		System.out.println(s2);

		s1.name = "김개똥";
		s1.count = 10;
		s1.check();

	}
}
