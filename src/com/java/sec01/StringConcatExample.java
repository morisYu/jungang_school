package com.java.sec01;

public class StringConcatExample {
	public static void main(String[] args) {
		/*
		 * ���� ������ ���� String Ÿ���� �տ� ������ �ڿ� �ִ� ���ڵ� String Ÿ������ ��ȯ�Ǿ� ���ڿ��� ������
		 * ���ڰ� �տ� ���� ��� ���ڸ� ���� �����ϰ� String Ÿ�԰� ���� �� Ÿ���� ��ȯ�Ǿ� ���ڿ��� ������
		 */
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + "Ư¡";
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0; //"JDK"�� 3�� ����Ǹ鼭 ���� 3�� ���ڿ��� ��ȯ, "JDK3"�� 3.0�� ����Ǹ鼭 3.0�� ���ڿ��� ��ȯ
		String str4 = 3 + 3.0 + "JDK"; //3�� 3.0�� ����Ǹ鼭 6.0�� �ǰ�, 6.0�� "JDK"�� ����Ǹ鼭 6.0�� ���ڿ��� ��ȯ��
		System.out.println(str3);
		System.out.println(str4);
	}
}
