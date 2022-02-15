package com.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestStudent {

	@BeforeAll
	public static void start() {
		System.out.println("�׽�Ʈ�� �����մϴ�.");
		System.out.println("---------------");
	}

	@Test
	@DisplayName("�л� �̸� ���� �׽�Ʈ")
	public void test1() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		assertEquals("ȫ�浿", student.name);
		System.out.println("�л� �̸�: " + student.name);
	}

	@Test
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test2() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		assertEquals(80, student.kor);
		System.out.println("���� ����: " + student.kor);
	}

	@Test
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test3() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		assertEquals(75, student.eng);
		System.out.println("���� ����: " + student.eng);
	}

	@Test
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test4() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		assertEquals(80, student.mat);
		System.out.println("���� ����: " + student.mat);
	}

	@Test
	@DisplayName("���� �հ� ��� �׽�Ʈ")
	public void test5() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		student.sum();
		assertEquals(235, student.sum);
		System.out.println("���� �հ�: " + student.sum);
	}

	@Test
	@DisplayName("���� ��� ��� �׽�Ʈ")
	public void test6() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		student.sum();
		student.avg();
		assertEquals(78.33, student.avg,0.01);
		System.out.println("���� ���: " + student.avg);
	}
	
	@Test
	@DisplayName("���� ��� ���� �׽�Ʈ")
	public void test7() {
		Student student = new Student("ȫ�浿", 80, 75, 80);
		student.sum();
		student.avg();
		student.grade();
		assertEquals('C', student.grade);
		System.out.println("���� ���: " + student.grade);
	}

}
