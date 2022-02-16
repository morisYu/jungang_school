package com.java.sec04;

public class Audio implements RemoteControl {

	private static final String obj = "Audio";
	private int volume;
	private boolean mute;

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
		this.mute = mute;
		if(mute) {
			System.out.println(obj+"�� ���� "+this.mute);
		}else {
			System.out.println(obj+"�� ���� "+this.mute);
		}
	}

}
