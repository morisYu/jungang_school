package com.java.ex;

public class Chap07Ex06_Parent {
	public String nation;
	
	public Chap07Ex06_Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Chap07Ex06_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
