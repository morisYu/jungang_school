package com.java.sec01;

public class CharExample2 {
	public static void main(String[] args) {
		char c1 = 'A'; // ���ڸ� ���� ����
		char c2 = 65; // 10������ ����
		char c3 = '\u0041'; // 16������ ����
		c3++; //��Ģ������(c3=c3+1) �ȵǴµ� ���������� ���ڷ� �� �ν� ��

		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
	    c4++;

		int uniCode = c1; // �����ڵ� ���

		System.out.println(c1 + "\t" + c2 + "\t" + c3);
		System.out.println(c2); //���� �����ڵ带 ��Ģ�����ϸ� ������ �ٲ�
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}
}
