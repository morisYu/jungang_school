package com.java.sec01;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		System.out.println("1~30���� ���");
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		System.out.println("1~30���� Ȧ���� ���");
		for (int i = 1; i <= 30; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		System.out.println("1~30���� ¦���� ���");
		for (int i = 2; i <= 30; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("�ý��� ����");
	}
}
