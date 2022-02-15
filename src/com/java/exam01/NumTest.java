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
		System.out.println("@BeforeAll 테스트 클래스 내에서 수행 전 1 회 실행");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("@BeforeEach 테스트케이스 실행 전");
	}

	@AfterEach
	public void TearDown() throws Exception {
		System.out.println("@AfterEach 테스트케이스 실행 후");
	}

	@Test
	void test1() {
		System.out.println(" test1() 메소드 실행");
		Num testobj = new Num(10);
		testobj.add(10);
		assertEquals(20,testobj.getValue());
		// assertEquals(예상값(기대값), 실제값(실행값))
	}
	
	@Disabled // 해당 메소드는 테스트 진행 안함
	@Test
	void disabled() {
		System.out.println("");
	}
	
	@Test
	void test2() {
		System.out.println(" test2() 메소드 실행");
		assertEquals(10,13,2);
		//assertEquals(예상값(기대값),실제값(실행값),허용오차값);
	}

	@Test
	void test3() {
		System.out.println(" test3() 메소드 실행");
		assertEquals(1,1);
	}

	@AfterAll
	public static void setUpAfterClass() throws Exception {
		System.out.println("@AfterAll 테스트 클래스 수행 후 1 회 실행");
	}

}
