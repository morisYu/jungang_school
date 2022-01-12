package com.java.sec01;

import java.util.Scanner;

public class TestScoreAnalasysProgram {

	public static void main(String[] args) {

		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		double avgKor = 0.0;
		double avgEng = 0.0;
		double avgMat = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("< �л� ���� �Է��ϼ��� >");
		System.out.print("�Է� >");
		int studentNo = scanner.nextInt();

		String[] name = new String[studentNo];
		int[] kor = new int[studentNo];
		int[] eng = new int[studentNo];
		int[] mat = new int[studentNo];
		int[] sum = new int[studentNo];
		double[] avg = new double[studentNo];
		System.out.println();
		System.out.println("< �л� �̸��� �Է��ϼ��� >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("�Է� >");
			name[i] = scanner.next(); // nextLine�� �տ��� �Է��� ���Ͱ� �νĵ�, �ѱ��� Ÿ���� �̻�����
		}

		for (int i = 0; i < studentNo; i++) {
			System.out.println(name[i]);
		}

		System.out.println();
		System.out.println("< ���������� �Է��ϼ��� >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("�Է� >");
			kor[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("< ���������� �Է��ϼ��� >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("�Է� >");
			eng[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("< ���������� �Է��ϼ��� >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("�Է� >");
			mat[i] = scanner.nextInt();
		}

		for (int i = 0; i < studentNo; i++) {
			sumKor += kor[i];
		}
		for (int i = 0; i < studentNo; i++) {
			sumEng += eng[i];
		}
		for (int i = 0; i < studentNo; i++) {
			sumMat += mat[i];
		}
		avgKor = average1point((double) sumKor / studentNo);
		avgEng = average1point((double) sumEng / studentNo);
		avgMat = average1point((double) sumMat / studentNo);
		System.out.println();
		System.out.println("< �� ���� ��� >");
		System.out.println("�����հ�: " + sumKor + " / �����հ�: " + sumEng + " / �����հ�: " + sumMat);
		System.out.println("�������: " + avgKor + " / �������: " + avgEng + " / �������: " + avgMat);
		System.out.println();
		System.out.println("< ���� ���� ��� >");
		for (int i = 0; i < studentNo; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
		}
		for (int i = 0; i < studentNo; i++) {
			avg[i] = average1point((double) sum[i] / 3.0);
		}
		for (int i = 0; i < studentNo; i++) {
			System.out.println("�̸�: " + name[i] + " / ����: " + kor[i] + " / ����: " + eng[i] + " / ����: " + mat[i]
					+ " / �հ�: " + sum[i] + " / ���: " + avg[i]);
		}

		// ����
		int[] rank = new int[studentNo];
		int max = sum[0];
		for (int i = 0; i < studentNo; i++) {
			for (int j = 0; j < studentNo - i; j++) {
				if (max < sum[i]) {
					max = sum[i];

				}
			}
			rank[studentNo - i] = 5;
		}

	}

	public static double average1point(double avg) {
		int a = (int) (avg * 100);
		int b = (int) (avg * 10) * 10;
		if (a - b >= 5) {
			avg = (double) (a + 10) / 100;
		} else {
			avg = (double) b / 100;
		}
		return avg;
	}

}
