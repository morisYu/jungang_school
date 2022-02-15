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

	static Student2 student = new Student2("홍길동", 80, 75, 80);
	
	@BeforeAll
	static void start() {
		System.out.println("테스트를 시작합니다.");
		System.out.println("---------------");
	}

	@Test
	@Order(1)
	@DisplayName("학생 이름 저장 테스트")
	public void test1() {
		assertEquals("홍길동", student.name);
	}

	@Test
	@Order(2)
	@DisplayName("국어 성적 저장 테스트")
	public void test2() {
		assertEquals(80, student.kor);
	}

	@Test
	@Order(3)
	@DisplayName("영어 성적 저장 테스트")
	public void test3() {
		assertEquals(75, student.eng);
	}

	
	@Test
	@Order(4)
	@DisplayName("수학 성적 저장 테스트")
	public void test4() {
		assertEquals(80, student.mat);
	}

	@Test
	@Order(5)
	@DisplayName("성적 합계 계산 테스트")
	public void test5() {
		student.sum();
		assertEquals(235, student.sum);
	}

	@Test
	@Order(6)
	@DisplayName("성적 평균 계산 테스트")
	public void test6() {
		student.avg();
		assertEquals(78.33, student.avg, 0.01);
	}
	
	@Test
	@Order(7)
	@DisplayName("성적 등급 저장 테스트")
	public void test7() {
		student.grade();
		assertEquals('C', student.grade);
	}

	
	@AfterAll
	static void print() {
		student.printResult();
	}

}
