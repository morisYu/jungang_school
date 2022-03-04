package chap11.sec07.art02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";

		System.out.println("�⺻ ���ڼ����� ���ڵ�");
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		System.out.print("bytes1: ");
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print(bytes1[i]);
			System.out.print(i == (bytes1.length - 1) ? "\n" : ", ");
		}
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		System.out.println("---------------\n");

		try {
			// EUC-KR ���ڼ��� ���ĺ��� 1����Ʈ, �ѱ��� 2����Ʈ�� ��ȯ
			System.out.println("Ư�� ���ڼ����� ���ڵ�(EUC-KR)");
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			System.out.print("bytes2: ");
			for (int i = 0; i < bytes2.length; i++) {
				System.out.print(bytes2[i]);
				System.out.print(i == (bytes2.length - 1) ? "\n" : ", ");
			}
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String: " + str2);
			System.out.println("---------------\n");

			// UTF-8 ���ڼ��� ���ĺ��� 1����Ʈ, �ѱ��� 3����Ʈ�� ��ȯ
			System.out.println("Ư�� ���ڼ����� ���ڵ�(UTF-8)");
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			System.out.print("bytes3: ");
			for (int i = 0; i < bytes3.length; i++) {
				System.out.print(bytes3[i]);
				System.out.print(i == (bytes3.length - 1) ? "\n" : ", ");
			}
			String str3 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
