package com.java.ex;

public class Chap10Ex07_LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

	public static void login(String id, String password)
			throws Chap10Ex07_WrongPasswordException, Chap10Ex07_NotExistIDExeption {

		// id �� "blue" �� �ƴ϶�� Chap10Ex07_NotExistIDExeption �߻���Ŵ
		if (!id.equals("blue")) {
			throw new Chap10Ex07_NotExistIDExeption("���̵� �����ϴ�.");
		}

		// password�� "12345" �� �ƴ϶�� Chap10Ex07_WrongPasswordException �߻���Ŵ
		if (!password.equals("12345")) {
			throw new Chap10Ex07_WrongPasswordException("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
}
