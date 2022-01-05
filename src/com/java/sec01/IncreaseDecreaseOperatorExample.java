package com.java.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------------------");
		x++; // x = x + 1 --> 11 (���� ���� ������)
		++x; // x = x + 1 --> 12 (���� ���� ������)
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		y--; // y = y - 1 --> 9
		--y; // y = y - 1 --> 8
		System.out.println("y= " + y);

		System.out.println("--------------------------");
		z = x++; // z�� x�� ���� �� (z = 12), x�� 1 ������(x=13)
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		z = ++x; // x�� 1�� ���� ��(x=14) z�� x�� ����(z=14)
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		z = ++x + y++; // x�� 1�� ���� ��(x=15) y�� ������ ���� z�� ����(z=23) �� y�� 1�� ������(y=9)
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
