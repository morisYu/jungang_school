package com.java.sec01;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // literal ��ü�� ������ �Ǿ ������� �����ڵ尡 c1�� ���Ե�
		char c2 = 'A';
		// char c3 = c2 + 1; // c2(����)�� 1�� ���� ����� "int" Ÿ���̱� ������ ������ �߻���
		char c3 = (char) (c2 + 1); // casting �ؾ� ������ ������ ����
		int c4 = 67;

		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println((int) c2); // c2(���� 'A')�� �����ڵ带 ���
		System.out.println("c3: " + c3);
		System.out.println((char) c4); // c4(���� 67)�� ���ڷ� ��ȯ�Ͽ� ���
	}
}
