package com.java.sec05;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed+=10;
	}
	
	// final �޼ҵ�� �������̵� �� �� ����
//	public void stop() {
//		System.out.println("������ī�� ����");
//		speed=0;
//	}
}
