package com.java.ex;

public class Chap06Ex16_17 {
	public static void main(String[] args) {
		// Ex16. 객체 생성해서 Printer 클래스 사용
		Printer printer = new Printer();
		printer.println16(10);
		printer.println16(true);
		printer.println16(5.7);
		printer.println16("홍길동");

		// Ex17. 객체 생성 없이 Printer 클래스 사용(정적 멤버)
		// 클래스에서 멤버(메소드) 불러오면 됨
		Printer.println17(10);
		Printer.println17(true);
		Printer.println17(5.7);
		Printer.println17("홍길동");

	}
}
