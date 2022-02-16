package com.java.sec03;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.setVolume(-8);
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.setVolume(-8);
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
	}
}
