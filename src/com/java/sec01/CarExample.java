package com.java.sec01;

public class CarExample {
	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();

		String[] car = new String[myCar.company.length];

		for (int i = 0; i < 3; i++) {
			car[i] = myCar.company[i];
		}

		// �ʵ尪 �б�
		for (int i = 0; i < 3; i++) {
			System.out.println("����ȸ��: " + car[i]);
		}

		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);

		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
		myCar.company[2] = "BMW";
		System.out.println("������ ��: " + myCar.company[2]);
	}
}
