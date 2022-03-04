package chap11.sec08.art02;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		// how1: ��ü ��ū ���� ��� for ������ ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		for (int i = 0; i < countToken; i++) {
			System.out.println(st.nextToken());
		}

		System.out.println();

		// how2: �����ִ� ��ū�� Ȯ���ϰ� while ������ ����
		st = new StringTokenizer(text, "/", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
