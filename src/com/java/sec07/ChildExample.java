package com.java.sec07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		Parent parent = child;
		parent.method1();
		parent.method2();
//		ȣ�� �Ұ���
//		parent.method3();
	}
}
