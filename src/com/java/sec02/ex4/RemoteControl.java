package com.java.sec02.ex4;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	public abstract void turnOn();

	// public abstract ���� �ص� ������ �� �ڵ����� ����.
	public void turnOff();

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
