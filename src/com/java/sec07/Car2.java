package com.java.sec07;

public class Car2 {

	int speed;

	void run() {
		System.out.println(speed + " ���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.speed = 60;
		myCar.run();
	}
}
