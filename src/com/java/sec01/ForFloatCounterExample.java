package com.java.sec01;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		// �ε��Ҽ��� Ÿ��(float, double)�� �Ҽ��� ���ϰ��� ��Ȯ�ϰ� ǥ������ ����.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			++a;
			System.out.print("float type " + a + " �� ����: ");
			System.out.println(x);
		}
		System.out.println("----------------------------");
		for (double d = 0.1; d <= 1.0; d += 0.1) {
			++b;
			System.out.print("double type " + b + " �� ����: ");
			System.out.println(d);
		}
	}
}
