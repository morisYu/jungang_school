package com.java.exam;

public class ArrayEx1 {
	public static void main(String[] args) {
		byte[] byteArr = { 1, 5, 55, 4, 30, 20 };
		System.out.println(byteArr.length);

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}

		// ��ü�� �����Ǿ��� �� ��ü �ּ� Ȯ��(���������� ������ ��ü�� �ּҰ� �����)
		String str1 = "asd";
		String str2 = "asd";
		String str3 = new String("asd");
		System.out.println(System.identityHashCode(str1)); //�ּҰ� 10������ ǥ����
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(str1 == str2); // ��ü �ּҰ� �����Ƿ� true
		System.out.println(str1 == str3); // ��ü �ּҰ� �ٸ��Ƿ� false
	}
}
