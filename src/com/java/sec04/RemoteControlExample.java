package com.java.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.turnOff();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.setMute(true);  // ���� �������̽��� ����Ʈ �޼ҵ� ȣ��
		RemoteControl.changeBattery();  // �������̽��� ���� �޼ҵ� ȣ��
		
		rc = new Audio();
		rc.turnOn();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.turnOff();  // �߻�޼ҵ� �������̵� �� ȣ��
		rc.setMute(true);  // �������̽��� ����Ʈ �޼ҵ带 �������̵� �� ȣ��
	}
}
