package com.java.exam02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void test1() {
		Student std = new Student("홍길동", 100, 90, 80);
		// std 객체에 이름 홍길동이 잘 저장되어 있는지 확인하는 테스트
		assertEquals("홍길동", std.name);
	}

	@Test
	@DisplayName("국어성적 확인하는 테스트")
	public void test2() {
		Student std = new Student("홍길동", 100, 90, 80);
		// std 객체에 국어성적이 잘 저장되어 있는지 확인하는 테스트
		assertEquals(100, std.kor);
	}

	@Test
	public void test3() {
		Student std = new Student("홍길동", 100, 90, 80);
		// std 객체에 영어성적이 잘 저장되어 있는지 확인하는 테스트
		assertEquals(90, std.eng);
	}

	@Test
	public void test4() {
		Student std = new Student("홍길동", 100, 90, 80);
		// std 객체에 수학성적이 잘 저장되어 있는지 확인하는 테스트
		assertEquals(80, std.mat);
	}

	@Test
	public void test5() {
		Student std = new Student("홍길동", 100, 100, 100);
		// std 객체에 총 합계가 잘 저장되어 있는지 확인하는 테스트
		std.sum();
		System.out.println(std.sum);
		assertEquals(300, std.sum);
	}

	@Test
	public void test6() {
		Student std = new Student("홍길동", 100, 100, 100);
		// std 객체에 평균이 잘 저장되어 있는지 확인하는 테스트
		std.sum();
		std.avg();
		System.out.println(std.avg);
		assertEquals(100.0, std.avg, 0.1);
	}

}
