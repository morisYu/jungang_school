package com.java.exam;

/*
 * �ѻ���� ���� ������ �Է��ϰ� ����ϴ°��� ���
 * ������� ���������� ��û ���ŷο�(���� �� �����ؼ� �����ؾ���)
 * �л��� ���� ����ϴ� �ڵ� ����� �� ��
 */

public class Ex04 {
	public static void main(String[] args) {

		// 1�� �л�
		int kor1 = (int) (Math.random() * 50) + 50;
		int eng1 = (int) (Math.random() * 50) + 50;
		int mat1 = (int) (Math.random() * 50) + 50;
		String name1 = "�ϱ浿";
		int sum1 = kor1 + eng1 + mat1;
		double avg1 = sum1 / 3.0;
		int avg1ToInt = (int) avg1;
		int Favg1;

		if ((avg1 - avg1ToInt) < 0.5) {
			Favg1 = avg1ToInt;
		} else {
			Favg1 = avg1ToInt + 1;
		}

		System.out.println("�̸�: " + name1);
		System.out.print("����: " + kor1);
		System.out.print(", ����: " + eng1);
		System.out.println(", ����: " + mat1);
		System.out.println("�հ�: " + sum1);
		System.out.println("���: " + avg1);
		System.out.println("��� �ݿø�: " + Favg1);
		System.out.println(" ");

		// 2�� �л�
		int kor2 = (int) (Math.random() * 50) + 50;
		int eng2 = (int) (Math.random() * 50) + 50;
		int mat2 = (int) (Math.random() * 50) + 50;
		String name2 = "�̱浿";
		int sum2 = kor2 + eng2 + mat2;
		double avg2 = sum2 / 3.0;
		int avg2ToInt = (int) avg2;
		int Favg2;

		if ((avg2 - avg2ToInt) < 0.5) {
			Favg2 = avg2ToInt;
		} else {
			Favg2 = avg2ToInt + 1;
		}

		System.out.println("�̸�: " + name2);
		System.out.print("����: " + kor2);
		System.out.print(", ����: " + eng2);
		System.out.println(", ����: " + mat2);
		System.out.println("�հ�: " + sum2);
		System.out.println("���: " + avg2);
		System.out.println("��� �ݿø�: " + Favg2);
		System.out.println(" ");

		// 3�� �л�
		int kor3 = (int) (Math.random() * 50) + 50;
		int eng3 = (int) (Math.random() * 50) + 50;
		int mat3 = (int) (Math.random() * 50) + 50;
		String name3 = "��浿";
		int sum3 = kor3 + eng3 + mat3;
		double avg3 = sum3 / 3.0;
		int avg3ToInt = (int) avg3;
		int Favg3;

		if ((avg3 - avg3ToInt) < 0.5) {
			Favg3 = avg3ToInt;
		} else {
			Favg3 = avg3ToInt + 1;
		}

		System.out.println("�̸�: " + name3);
		System.out.print("����: " + kor3);
		System.out.print(", ����: " + eng3);
		System.out.println(", ����: " + mat3);
		System.out.println("�հ�: " + sum3);
		System.out.println("���: " + avg3);
		System.out.println("��� �ݿø�: " + Favg3);
		System.out.println(" ");

		String N1, N2, N3;

		// �� ���� ���ϱ�
		if (sum1 < sum2) {
			if (sum1 < sum3) {
				N1 = name1;
				if (sum2 < sum3) {
					N2 = name2;
					N3 = name3;
				} else {
					N2 = name3;
					N3 = name2;
				}
			}

			else {
				N1 = name3;
				N2 = name1;
				N3 = name2;
			}
		} else {
			if (sum2 < sum3) {
				if (sum1 < sum3) {
					N1 = name2;
					N2 = name1;
					N3 = name3;
				} else {
					N1 = name3;
					N2 = name2;
					N3 = name1;
				}
			} else {
				N1 = name3;
				N2 = name2;
				N3 = name1;
			}
		}
		System.out.println("1 ��: " + N3);
		System.out.println("2 ��: " + N2);
		System.out.println("3 ��: " + N1);
	}
}
