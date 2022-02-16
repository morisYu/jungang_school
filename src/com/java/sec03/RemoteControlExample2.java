package com.java.sec03;

public class RemoteControlExample2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("�͸� ���� ON");
				
			}

			@Override
			public void turnOff() {
				System.out.println("�͸� ���� OFF");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("�͸� ���� Set");
				
			}
		};
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
	}
}
