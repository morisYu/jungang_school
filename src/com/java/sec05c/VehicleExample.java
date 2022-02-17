package com.java.sec05c;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		Taxi taxi = new Taxi();

		vehicle.run();
		// vehicle.checkFare(); // Vehicle �������̽����� �ش� �޼ҵ� ����

		Bus bus = (Bus) vehicle;

		bus.run();
		bus.checkFare();

		Driver driver = new Driver();

		driver.drive(vehicle);
		
		driver.drive(taxi);

	}
}
