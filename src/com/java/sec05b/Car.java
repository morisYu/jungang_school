package com.java.sec05b;

import com.java.sec05a.Tire;

public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
