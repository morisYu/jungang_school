package com.java.sec01;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		// ���� for�������� �迭�� ���̸�ŭ �迭�ȿ� �ִ� ���� ������� �ҷ���
		for (int score : scores) {
			sum += score;
		}
		System.out.println("���� ���� = " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);

		// �迭�ȿ� �ִ� ���� �ٸ� Ÿ�Ե� �� �� ����
		String stf = new String(); //string Ÿ���� ���� �ʱⰪ�� null�� �ϱ� ���ؼ��� new�� ��������
		String[] str = { "Java ", "is ", "good" };
		for (String st : str) {
			stf += st;
		}
		System.out.println(stf);
	}
}
