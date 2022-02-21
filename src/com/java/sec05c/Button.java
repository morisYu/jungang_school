package com.java.sec05c;

public class Button {
	OnClickListener listener;  // ��ø �������̽� Ÿ���� �ʵ�

	// �Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// ���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}

	// ��ø �������̽�
	interface OnClickListener {
		void onClick();
	}
}
