package com.java.sec04;

public class Car {

	// �ʵ�
	String company = "�����ڵ�â";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car() {

	}

	Car(String model) {
		this(model,null,0);
	}

	Car(String model, String color) {
		this(model,color,0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
