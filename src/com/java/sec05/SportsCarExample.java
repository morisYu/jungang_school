package com.java.sec05;

public class SportsCarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("�ӵ�: " + car.speed);

		car.speedUp();
		car.speedUp();
		car.speedUp();

		System.out.println("�ӵ�: " + car.speed);

		car.stop();

		System.out.println("�ӵ�: " + car.speed);
		
		SportsCar scar = new SportsCar();
		
		scar.speedUp();
		
		System.out.println("�ӵ�: "+scar.speed);
		
		
	}
}
