package com.java.sec01;

// �־��� �迭���� �ִ밪 ���ϱ�
// �߰��� �ּҰ��� ���ϱ�

public class Chap05Ex07 {
	public static void main(String[] args) {
		int max = 0; // �迭 �ȿ� �ִ� ���ں��� ũ�� �ȵ�
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);

		int min = array[0]; // �迭 �ȿ� �ִ� ���ں��� ������ �ȵǱ� ������ �迭�� �ִ� �ƹ� ���ڸ� ����
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: " + min);
	}
}
