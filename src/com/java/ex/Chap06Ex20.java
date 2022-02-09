package com.java.ex;

import java.util.Scanner;

public class Chap06Ex20 {
	private static Account_Ex20[] accountArray = new Account_Ex20[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// ��ü�� �迭�� �������� �� �� ��ü���� �ʱ�ȭ �ʿ���.
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Account_Ex20("none", "none", 0);
		}

		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4. ��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");

			try {
				selectNo = scanner.nextInt();
			} catch (Exception e) {
				scanner = new Scanner(System.in);
				continue;
			}

			switch (selectNo) {
			case 1:
				System.out.println("-------");
				System.out.println("���� ����");
				System.out.println("-------");
				createAccount();
				break;
			case 2:
				System.out.println("-------");
				System.out.println("���� ���");
				System.out.println("-------");
				accountList();
				break;
			case 3:
				System.out.println("-------");
				System.out.println("����");
				System.out.println("-------");
				deposit();
				break;
			case 4:
				System.out.println("-------");
				System.out.println("���");
				System.out.println("-------");
				withdraw();
				break;
			case 5:
				System.out.println("-------");
				System.out.println("����");
				System.out.println("-------");
				run = false;
				break;
			default:
				System.out.println("�ٽ� ����");
				System.out.println("=======");
				break;
			}
		}
		System.out.println("Program OFF");
	}

	// ���� �����ϱ�
	private static void createAccount() {
		int tmp = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == "none") {
				tmp = i;
				break;
			}
		}
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		accountArray[tmp].setAno(ano);
		accountArray[tmp].setOwner(owner);
		accountArray[tmp].setBalance(balance);

	}

	// ���� ��Ϻ���
	private static void accountList() {
		int tmp = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == "none") {
				tmp = i;
				break;
			}
		}
		System.out.println(" ���¹�ȣ   " + "  ������   " + "���ݾ�");
		for (int i = 0; i < tmp; i++) {
			System.out.print(accountArray[i].getAno() + "   " + accountArray[i].getOwner() + "   "
					+ accountArray[i].getBalance() + "\n");
		}
	}

	// �����ϱ�
	private static void deposit() {
		while (true) {
			System.out.print("���¹�ȣ: ");
			String ano = scanner.next();
			System.out.print("���ݾ�: ");
			int money = scanner.nextInt();
			int balance = Math.abs(money);

			for (int i = 0; i < accountArray.length; i++) {
				if (ano.equals(accountArray[i].getAno())) {
					accountArray[i].setBalance(balance);
					System.out.println("�ܾ�: " + accountArray[i].getBalance());
					return;
				}
			}
			System.out.println("���¹�ȣ�� �ٽ� �Է��ϼ���");
			continue;
		}
	}

	// ����ϱ�
	private static void withdraw() {
		while (true) {
			System.out.print("���¹�ȣ: ");
			String ano = scanner.next();
			System.out.print("���ݾ�: ");
			int money = scanner.nextInt();
			int balance = -(Math.abs(money));

			for (int i = 0; i < accountArray.length; i++) {
				if (ano.equals(accountArray[i].getAno())) {
					accountArray[i].setBalance(balance);
					System.out.println("�ܾ�: " + accountArray[i].getBalance());
					return;
				}
			}
			System.out.println("���¹�ȣ�� �ٽ� �Է��ϼ���");
			continue;
		}
	}
}
