package chap11.sec03.art03;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		String str = "���ڿ�";

		System.out.println(obj1.toString());
		
		// Date Ŭ������ toString() �޼ҵ带 �������ؼ� ���� �ý��� ��¥�� �ð��� ǥ��
		System.out.println(obj2.toString());
		
		// String Ŭ������ toString() �޼ҵ带 �������ؼ� �����ϰ��ִ� ���ڿ��� ����
		System.out.println(str.toString());
	}
}
