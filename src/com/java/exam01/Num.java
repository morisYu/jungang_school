package com.java.exam01;

public class Num {
	private int value;

	public Num(int value) {
		this.value = value;
	}

	public int add(int rhs) {
		return this.value += rhs;
	}
	
	public int getValue() {
		return this.value;
	}
}
