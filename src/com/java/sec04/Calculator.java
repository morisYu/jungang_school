package com.java.sec04;

public class Calculator {
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");

	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	boolean power(String str) {
		if (str.equals("on")) {
			System.out.println("POWER " + str);
			return true;
		} else if (str == "off") {
			System.out.println("POWER " + str);
			return false;
		}
		return true;
	}
}
