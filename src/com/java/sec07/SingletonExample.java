package com.java.sec07;

public class SingletonExample {
	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		
		// singleton ��ü�� �ҷ��ͼ� obj1, obj2 �� ���� ��ü �ּҸ� ������
		System.out.println(obj1);
		System.out.println(obj2);

	}
}
