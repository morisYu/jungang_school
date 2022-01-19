package com.java.sec05;

public class Cartest {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setGas((int) (Math.random() * 21));
		while (myCar.isLeftGas()) {
			for (int i = 0; i < 30; i++) {
				if (i == 0 || i == 29) {
					System.out.print("|");
				}
				if (i == myCar.gas + 1) {
					System.out.print("H");
				}
				System.out.print(" ");
			}
			System.out.println();
			myCar.gas--;
			if (myCar.gas <= 3) {
				myCar.gas += (int) (Math.random() * 17);
			}
		}
	}
}
