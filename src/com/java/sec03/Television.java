package com.java.sec03;

public class Television implements RemoteControl {

	static final String obj = "TV";
	private int volume;

	@Override
	public void turnOn() {
		System.out.println(obj + "�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println(obj + "�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(obj + "�� ���� ����: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó��!!");
		} else {
			System.out.println("���� ����!!!");
		}
	}
	
}
