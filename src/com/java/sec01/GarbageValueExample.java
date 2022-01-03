package com.java.sec01;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; //byte 타입은 -128에서127까지이므로 127을 넘어가는 순간 -128부터 다시 시작됨.
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
