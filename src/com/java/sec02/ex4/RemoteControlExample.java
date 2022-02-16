package com.java.sec02.ex4;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스는 객체생성 불가능
		// RemoteControl remote = new RemoteControl();

		System.out.println("Math.PI : " + Math.PI);
		System.out.println("RemoteControl.MAX_VOLUME : " + RemoteControl.MAX_VOLUME);
		System.out.println("RemoteControl.MIN_VOLUME : " + RemoteControl.MIN_VOLUME);
		System.out.println("");
		RemoteControl.changeBattery();
	}
}
