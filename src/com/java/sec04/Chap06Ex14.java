package com.java.sec04;

public class Chap06Ex14 {
	public static void main(String[] args) {
		String[] member = new String[] {};
		Chap06Ex13 member1 = new Chap06Ex13("홍길동", "hong");
		Chap06Ex13 member2 = new Chap06Ex13("강자바", "java");
		System.out.println(member1.name);
		System.out.println(member2.name);
		System.out.println(member.length);
	}
}
