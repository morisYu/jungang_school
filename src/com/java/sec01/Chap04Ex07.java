package com.java.sec01;

/*
 * whlie���� Scanner�� �̿��ؼ� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ� �ۼ�
 */

import java.util.Scanner;

public class Chap04Ex07 {
	public static void main(String[] args) {
		int money = 0;
		boolean run = true;
		OUT: while (run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.println("����> ");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String menu = scan.nextLine();
			switch (menu) {
			case "1":
				System.out.println("���ݾ��� �Է����ּ���> ");
				int cashIn = scan.nextInt();
				money += cashIn;
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("�ܰ�: " + money + " ��");
				break;
			case "2":
				System.out.println("��ݾ��� �Է����ּ���> ");
				int cashOut = scan.nextInt();
				money -= cashOut;
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				System.out.println("�ܰ�: " + money + " ��");
				break;
			case "3":
				System.out.println("�ܰ�: " + money + " ��");
				break;
			case "4":
				System.out.println("���α׷��� �����մϴ�.");
				break OUT;
			default:
				System.out.println("�޴��� �ٽ� �������ּ���.");
			}

		}
	}
}
