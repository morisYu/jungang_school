package com.java.ex;

public class Chap08Ex04_OracleDao implements Chap08Ex04_DataAccessObject {

	private String str = "Oracle DB";

	@Override
	public void selet() {
		System.out.println(str + "���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(str + "�� ����");
	}

	@Override
	public void update() {
		System.out.println(str + "�� ����");
	}

	@Override
	public void delete() {
		System.out.println(str + "���� ����");
	}

}
