package com.java.ex;

// �̱��� ��ü ����
public class Chap06Ex18 {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
	}
}