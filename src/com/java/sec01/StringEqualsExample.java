package com.java.sec01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		String strVar3 = new String("ȫ�浿");

		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println("\n");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
