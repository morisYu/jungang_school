package com.java.sec01;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3=byteValue1+byteValue2; //�ǿ����ڸ� 4byte ������ �����ϱ� ������ ���� �����
		// byteŸ���� �� �� ����(intŸ������ ��ȯ�Ǿ� ������ ��)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue1+charValue2; //�� ���ڴ� int Ÿ���� �����ڵ�� ������ �Ǳ� ������ ���� ����� int Ÿ���� ��
		int intValue2 = charValue1 + charValue2;

		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // ���� ����� �Ǽ������� ��� �ǿ����ڰ� int Ÿ���̱� �߱� ������ ���� ������� int Ÿ������ ����
		System.out.println(intValue4);

		int intValue5 = 10;
		// int intValue6=10/4.0; //�ǿ����ڿ� �Ǽ��� ���ԵǾ��ֱ� ������ int Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ������ �Ǳ� ������
		// ���� ����� �Ǽ� Ÿ��(float, double)���� ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

	}
}
