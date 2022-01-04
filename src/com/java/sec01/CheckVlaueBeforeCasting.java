package com.java.sec01;

public class CheckVlaueBeforeCasting {
	public static void main(String[] args) {
		System.out.println("Byte.MIN_VALUE : " + Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE : " + Byte.MAX_VALUE);
		System.out.print("\n");
		for (int i = -130; i <= 130; i = i + 20) {
			if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) { // byte 타입의 최소값~최대값 외의 범위에 해당할 때
				System.out.println("byte 타입으로 변환할 수 없습니다.");
				System.out.println("값을 다시 확인해 주세요");
			} else {
				byte b = (byte) i;
				System.out.println(b);
			}
		}
	}
}
