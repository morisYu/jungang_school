package com.java.sec01;

public class CheckVlaueBeforeCasting {
	public static void main(String[] args) {
		System.out.println("Byte.MIN_VALUE : " + Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE : " + Byte.MAX_VALUE);
		System.out.print("\n");
		for (int i = -130; i <= 130; i = i + 20) {
			if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) { // byte Ÿ���� �ּҰ�~�ִ밪 ���� ������ �ش��� ��
				System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
				System.out.println("���� �ٽ� Ȯ���� �ּ���");
			} else {
				byte b = (byte) i;
				System.out.println(b);
			}
		}
	}
}
