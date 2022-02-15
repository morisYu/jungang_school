package com.java.exam02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void test1() {
		Student std = new Student("ȫ�浿", 100, 90, 80);
		// std ��ü�� �̸� ȫ�浿�� �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		assertEquals("ȫ�浿", std.name);
	}

	@Test
	@DisplayName("����� Ȯ���ϴ� �׽�Ʈ")
	public void test2() {
		Student std = new Student("ȫ�浿", 100, 90, 80);
		// std ��ü�� ������� �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		assertEquals(100, std.kor);
	}

	@Test
	public void test3() {
		Student std = new Student("ȫ�浿", 100, 90, 80);
		// std ��ü�� ������� �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		assertEquals(90, std.eng);
	}

	@Test
	public void test4() {
		Student std = new Student("ȫ�浿", 100, 90, 80);
		// std ��ü�� ���м����� �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		assertEquals(80, std.mat);
	}

	@Test
	public void test5() {
		Student std = new Student("ȫ�浿", 100, 100, 100);
		// std ��ü�� �� �հ谡 �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		std.sum();
		System.out.println(std.sum);
		assertEquals(300, std.sum);
	}

	@Test
	public void test6() {
		Student std = new Student("ȫ�浿", 100, 100, 100);
		// std ��ü�� ����� �� ����Ǿ� �ִ��� Ȯ���ϴ� �׽�Ʈ
		std.sum();
		std.avg();
		System.out.println(std.avg);
		assertEquals(100.0, std.avg, 0.1);
	}

}
