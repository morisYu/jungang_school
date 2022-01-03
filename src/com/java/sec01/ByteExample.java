package com.java.sec01;

public class ByteExample {
	public static void main(String[] args) {
		byte var[]= {-128,30,0,30,127};
		/*byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;*/

		for(int i=0;i<5;i++) {
			System.out.println("var"+(i+1)+" = "+var[i]);
		}
		Integer(6);
	}
	public static void Integer(int a) {
		int var[] = {-300,-100,10,0,10,100,300};
		for(int i=0;i<a;i++) {
			System.out.println("int var"+(i+1)+" = "+var[i]);
		}
	}
}
