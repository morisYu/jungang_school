package com.java.ex;

public class Chap09Ex05_Anonymous {
	
	// �ʵ� �ʱⰪ���� ����
	Chap09Ex05_Vehicle field = new Chap09Ex05_Vehicle() {

		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
		
	};

	void method1() {
		// ���� ���������� ����
		Chap09Ex05_Vehicle localVar = new Chap09Ex05_Vehicle() {

			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
			
		};
		// ���� ���� ���
		localVar.run();
	}
	
	void method2(Chap09Ex05_Vehicle v){
		v.run();
	}
}
