package com.java.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NumTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll �׽�Ʈ Ŭ���� ������ ���� �� 1 ȸ ����");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("@BeforeEach �׽�Ʈ���̽� ���� ��");
	}

	@AfterEach
	public void TearDown() throws Exception {
		System.out.println("@AfterEach �׽�Ʈ���̽� ���� ��");
	}

	@Test
	void test1() {
		System.out.println(" test1() �޼ҵ� ����");
		Num testobj = new Num(10);
		testobj.add(10);
		assertEquals(20,testobj.getValue());
		// assertEquals(����(��밪), ������(���ప))
	}
	
	@Disabled // �ش� �޼ҵ�� �׽�Ʈ ���� ����
	@Test
	void disabled() {
		System.out.println("");
	}
	
	@Test
	void test2() {
		System.out.println(" test2() �޼ҵ� ����");
		assertEquals(10,13,2);
		//assertEquals(����(��밪),������(���ప),��������);
	}

	@Test
	void test3() {
		System.out.println(" test3() �޼ҵ� ����");
		assertEquals(1,1);
	}

	@AfterAll
	public static void setUpAfterClass() throws Exception {
		System.out.println("@AfterAll �׽�Ʈ Ŭ���� ���� �� 1 ȸ ����");
	}

}
