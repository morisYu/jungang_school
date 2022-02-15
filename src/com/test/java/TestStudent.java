package com.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestStudent {

	@BeforeAll
	public static void start() {
		System.out.println("테스트를 시작합니다.");
		System.out.println("---------------");
	}

	@Test
	@DisplayName("학생 이름 저장 테스트")
	public void test1() {
		Student student = new Student("홍길동", 80, 75, 80);
		assertEquals("홍길동", student.name);
		System.out.println("학생 이름: " + student.name);
	}

	@Test
	@DisplayName("국어 성적 저장 테스트")
	public void test2() {
		Student student = new Student("홍길동", 80, 75, 80);
		assertEquals(80, student.kor);
		System.out.println("국어 성적: " + student.kor);
	}

	@Test
	@DisplayName("영어 성적 저장 테스트")
	public void test3() {
		Student student = new Student("홍길동", 80, 75, 80);
		assertEquals(75, student.eng);
		System.out.println("영어 성적: " + student.eng);
	}

	@Test
	@DisplayName("수학 성적 저장 테스트")
	public void test4() {
		Student student = new Student("홍길동", 80, 75, 80);
		assertEquals(80, student.mat);
		System.out.println("수학 성적: " + student.mat);
	}

	@Test
	@DisplayName("성적 합계 계산 테스트")
	public void test5() {
		Student student = new Student("홍길동", 80, 75, 80);
		student.sum();
		assertEquals(235, student.sum);
		System.out.println("성적 합계: " + student.sum);
	}

	@Test
	@DisplayName("성적 평균 계산 테스트")
	public void test6() {
		Student student = new Student("홍길동", 80, 75, 80);
		student.sum();
		student.avg();
		assertEquals(78.33, student.avg,0.01);
		System.out.println("성적 평균: " + student.avg);
	}
	
	@Test
	@DisplayName("성적 등급 저장 테스트")
	public void test7() {
		Student student = new Student("홍길동", 80, 75, 80);
		student.sum();
		student.avg();
		student.grade();
		assertEquals('C', student.grade);
		System.out.println("성적 등급: " + student.grade);
	}

}
