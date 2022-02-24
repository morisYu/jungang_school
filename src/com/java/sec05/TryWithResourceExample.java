package com.java.sec05;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("�׽�Ʈ �ڵ尡 ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
