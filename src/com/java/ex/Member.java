package com.java.ex;

public class Member {
	String name = new String();
	String id = new String();
	String password = new String();
	int age;

	Member() {

	}

	Member(String name) {
		this(name, null, null, 0);
	}

	Member(String name, String id) {
		this(name, id, null, 0);
	}

	Member(String name, String id, String password) {
		this(name, id, password, 0);
	}

	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
