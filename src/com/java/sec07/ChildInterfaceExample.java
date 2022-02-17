package com.java.sec07;

// �������̽��� ���� Ŭ������ ������ �������� �ʰ� ���� Ŭ�������� ���� ����

public class ChildInterfaceExample {
	public static void main(String[] args) {
		
		// ChildInterface1 �� ����
		ChildInterface1 child1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ChildInterface1 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 -method3()");
			}
			
		};
		
		// ChildInterface2 �� ����
		ChildInterface2 child2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 -method3()");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface2 -method2() Override");
			}
			
		};
		
		// ChildInterface3 �� ����
		ChildInterface3 child3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 -method1()");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 -method3()");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3 -method2() Override");
			}
			
		};
		
		System.out.println("ChildInterface1 �� ���� \n");
		child1.method1();
		child1.method2();
		child1.method3();
		System.out.println("--------------------");
		
		System.out.println("ChildInterface2 �� ���� \n");
		child2.method1();
		child2.method2();
		child2.method3();
		System.out.println("--------------------");
		
		System.out.println("ChildInterface3 �� ���� \n");
		child3.method1();
		child3.method2();
		child3.method3();
		System.out.println("--------------------");
		
	}
}
