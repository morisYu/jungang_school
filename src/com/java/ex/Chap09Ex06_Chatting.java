package com.java.ex;

import java.util.Scanner;

public class Chap09Ex06_Chatting {
	public static void main(String[] args) {
		Chap09Ex06_Chatting chatting = new Chap09Ex06_Chatting();

		chatting.startChat("moris");

	}

	void startChat(String chatId) {
		// ���� Ŭ������ �޼ҵ��� �Ű� ������ ���� ������ ����� ��� ���Ǵ� �Ű� ������ ���� ������ final �� Ư���� ������.
		// ���������� �͸� ��ü�� �޼ҵ��� �Ű� ������ ���� ������ ����� ���� final �� Ư���� ������.
		// ���� �͸� ��ü���� ���Ǵ� �Ű������� ���� �� ���� ������ �� �ִ�.
//		String nickName = null;
//		nickName = chatId;

		String nickName = chatId;

		String outputData = null;
		outputData = "�߰�����";
		String end = "bye";

		Chat chat = new Chat() {
			@Override
			public void start() {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				while (true) {
					String inputData = scanner.next();
					if(inputData.equals(end)) {
						break;
					}
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
		System.out.println(outputData);
	}

	class Chat {
		void start() {

		}

		void sendMessage(String message) {
			System.out.println(message);
		}
	}
}
