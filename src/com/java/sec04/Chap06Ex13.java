package com.java.sec04;

public class Chap06Ex13 {
	String name;
	String id;
	String password;
	int age;

	Chap06Ex13() {
		System.out.println("생성자(이름,아이디) 를 입력하세요");
	}

	Chap06Ex13(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
