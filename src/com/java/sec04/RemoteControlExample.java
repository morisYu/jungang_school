package com.java.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();  // 추상메소드 오버라이드 후 호출
		rc.turnOff();  // 추상메소드 오버라이드 후 호출
		rc.setMute(true);  // 기존 인터페이스의 디폴트 메소드 호출
		RemoteControl.changeBattery();  // 인터페이스의 정적 메소드 호출
		
		rc = new Audio();
		rc.turnOn();  // 추상메소드 오버라이드 후 호출
		rc.turnOff();  // 추상메소드 오버라이드 후 호출
		rc.setMute(true);  // 인터페이스의 디폴트 메소드를 오버라이드 후 호출
	}
}
