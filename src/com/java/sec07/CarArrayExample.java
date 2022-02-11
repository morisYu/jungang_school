package com.java.sec07;

public class CarArrayExample {
	public static void main(String[] args) {
		CarArray car = new CarArray();

		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation - 1].location + "HankookTire·Î ±³Ã¼");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
			System.out.println("--------------------------------");
		}
	}
}
