package com.java.sec01;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; //byte Ÿ���� -128����127�����̹Ƿ� 127�� �Ѿ�� ���� -128���� �ٽ� ���۵�.
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
