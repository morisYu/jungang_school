package com.java.ex;

public class Chap08Ex05_ActionExample {
	public static void main(String[] args) {
		
		// �͸� ���� ��ü ����
		Chap08Ex05_Action action = new Chap08Ex05_Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
			
		};
		
		action.work();
	}
}
