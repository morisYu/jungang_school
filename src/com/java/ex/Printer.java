package com.java.ex;

public class Printer {
	// �ν��Ͻ� ���
	int numberI;
	boolean bool;
	double numberD;
	String str;

	Printer() {

	}

	void println16(int numberI) {
		this.numberI = numberI;
		System.out.println(this.numberI);
		System.out.println(numberI);
	}

	void println16(boolean bool) {
		this.bool = bool;
		System.out.println(this.bool);
		System.out.println(bool);
	}

	void println16(double numberD) {
		this.numberD = numberD;
		System.out.println(this.numberD);
		System.out.println(numberD);
	}

	void println16(String str) {
		this.str = str;
		System.out.println(this.str);
		System.out.println(str);
	}

	// ���� ���(���� �ʵ�� �Էµ� ������ �ٲ� �� ����)
	// static int nI;
	// static boolean b;
	// static double nD;
	// static String s;

	static void println17(int nI) {
		// this.nI = nI;
		System.out.println(nI);
	}

	static void println17(boolean b) {
		System.out.println(b);
	}

	static void println17(double nD) {
		System.out.println(nD);
	}

	static void println17(String s) {
		System.out.println(s);
	}

}
