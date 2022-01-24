package com.java.sec07;

public class SingletonExample {
	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		
		// singleton 객체를 불러와서 obj1, obj2 는 같은 객체 주소를 참조함
		System.out.println(obj1);
		System.out.println(obj2);

	}
}
