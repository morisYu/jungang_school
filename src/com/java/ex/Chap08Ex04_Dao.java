package com.java.ex;

public class Chap08Ex04_Dao implements Chap08Ex04_DataAccessObject {

	private String str;

	public Chap08Ex04_Dao(String str) {
		this.str = str;
	}

	@Override
	public void selet() {
		System.out.println(str + " DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(str + " DB�� ����");
	}

	@Override
	public void update() {
		System.out.println(str + " DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println(str + " DB���� ����");
	}

}
