package com.java.sec01;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		int num5 = 123456780;

		float num3 = num2; // �ڵ� ����ȯ(���� Ÿ���� �Ǽ� Ÿ������ ����ȯ �� �� ���е� �ս��� ���ؾ� ��)
		/*
		 * float : ��ȣ(1bit)+����(8bit)+����(23bit)�� ǥ���� �Ǵµ� 123456780�� 23bit�� ǥ���� �Ұ����ϱ� ������
		 * �ٻ�ġ�� ��ȯ�Ǹ鼭 ���е� �ս��� �߻��� ����, float�� �ƴ� double(�����κ��� 52bit)�� ����ȯ�� �ϸ� ���е� �ս��� ����
		 * �� ����
		 */
		num2 = (int) num3; // ���� ����ȯ

		double num4 = num5; // int Ÿ���� double Ÿ������ ��ȯ�ϸ� ���е� �ս� ����
		num5 = (int) num4;

		int result = num1 - num2;
		System.out.println(result);
		int result2 = num1 - num5;
		System.out.println(result2);

	}
}
