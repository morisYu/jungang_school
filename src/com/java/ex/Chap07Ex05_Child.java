package com.java.ex;

public class Chap07Ex05_Child extends Chap07Ex05_Parent {
	@SuppressWarnings("unused")
	private int studentNo;

	/*
	 * ��ӹ޾��� ��쿡 �θ�Ŭ������ �����ڰ� �ִٸ� �ڽ�Ŭ�������� super �޼ҵ�� �θ�ü�� ȣ���ؾ��� public
	 * Chap07Ex05_Child(String name, int studentNo) {
	 * 
	 * this.name = name; this.studentNo = studentNo; }
	 */

	public Chap07Ex05_Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}
