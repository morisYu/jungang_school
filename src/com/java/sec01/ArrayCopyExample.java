package com.java.sec01;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "Java", "array", "copy" };
		String[] newStrArray = new String[5];
		// System.arraycopy(�����迭,�����迭 ���������ġ,�纻�迭,�纻�迭 ���������ġ,�����迭 ���� ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			if (i != (newStrArray.length - 1)) {
				System.out.print(newStrArray[i] + ", ");
			} else {
				System.out.print(newStrArray[i]);
			}

		}
	}
}
