package com.java.sec01;

public class LongeExample {
	public static void main(String[] args) {
		long var1 = 10; // int=>long �ڵ� ����ȯ
		long var2 = 20l;
		// long var3 = 1000000000000; //���ڸ� ������ int�� �ν��� �Ǿ int ������ �Ѿ�� ������ ������ ��
		long var4 = 1000000000000l; // long ���� ǥ���ϰ� ������ ���� �ڿ� 'l'�Ǵ� 'L'�� �ٿ���� �Ѵ�.

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
