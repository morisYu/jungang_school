package com.java.ex;

public class Chap08Ex04_MySqlDao implements Chap08Ex04_DataAccessObject {

	private String str = "MySql DB";

	@Override
	public void selet() {
		System.out.println(str + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(str + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(str + "를 수정");
	}

	@Override
	public void delete() {
		System.out.println(str + "에서 삭제");
	}

}
