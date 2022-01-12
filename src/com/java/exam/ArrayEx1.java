package com.java.exam;

public class ArrayEx1 {
	public static void main(String[] args) {
		byte[] byteArr = { 1, 5, 55, 4, 30, 20 };
		System.out.println(byteArr.length);

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}

		// 객체가 생성되었을 때 객체 주소 확인(참조변수는 변수에 객체의 주소가 저장됨)
		String str1 = "asd";
		String str2 = "asd";
		String str3 = new String("asd");
		System.out.println(System.identityHashCode(str1)); //주소가 10진수로 표현됨
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(str1 == str2); // 객체 주소가 같으므로 true
		System.out.println(str1 == str3); // 객체 주소가 다르므로 false
	}
}
