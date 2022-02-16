package com.java.sec03;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("smartTV ON");

	}

	@Override
	public void turnOff() {
		System.out.println("smartTV OFF");

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
		System.out.println("Smart TV 볼륨: " + this.volume);
	}

}
