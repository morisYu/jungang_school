package com.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(OrderAnnotation.class)
class TestStudent2 {

	static Student2 student = new Student2("ȫ�浿", 80, 75, 80);
	
	@BeforeAll
	static void start() {
		System.out.println("�׽�Ʈ�� �����մϴ�.");
		System.out.println("---------------");
	}

	@Test
	@Order(1)
	@DisplayName("�л� �̸� ���� �׽�Ʈ")
	public void test1() {
		assertEquals("ȫ�浿", student.name);
	}

	@Test
	@Order(2)
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test2() {
		assertEquals(80, student.kor);
	}

	@Test
	@Order(3)
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test3() {
		assertEquals(75, student.eng);
	}

	
	@Test
	@Order(4)
	@DisplayName("���� ���� ���� �׽�Ʈ")
	public void test4() {
		assertEquals(80, student.mat);
	}

	@Test
	@Order(5)
	@DisplayName("���� �հ� ��� �׽�Ʈ")
	public void test5() {
		student.sum();
		assertEquals(235, student.sum);
	}

	@Test
	@Order(6)
	@DisplayName("���� ��� ��� �׽�Ʈ")
	public void test6() {
		student.avg();
		assertEquals(78.33, student.avg, 0.01);
	}
	
	@Test
	@Order(7)
	@DisplayName("���� ��� ���� �׽�Ʈ")
	public void test7() {
		student.grade();
		assertEquals('C', student.grade);
	}

	
	@AfterAll
	static void print() {
		student.printResult();
	}

}
