package com.java.ex;

public class Chap06Ex16_17 {
	public static void main(String[] args) {
		// Ex16. ��ü �����ؼ� Printer Ŭ���� ���
		Printer printer = new Printer();
		printer.println16(10);
		printer.println16(true);
		printer.println16(5.7);
		printer.println16("ȫ�浿");

		// Ex17. ��ü ���� ���� Printer Ŭ���� ���(���� ���)
		// Ŭ�������� ���(�޼ҵ�) �ҷ����� ��
		Printer.println17(10);
		Printer.println17(true);
		Printer.println17(5.7);
		Printer.println17("ȫ�浿");

	}
}
