package com.java.ex;

public class Chap09Ex05_AnonymousExample {
	public static void main(String[] args) {
		Chap09Ex05_Anonymous anony = new Chap09Ex05_Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.field.run();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(new Chap09Ex05_Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}

		});
	}
}
