package com.java.sec01;

public class VariableScopeExample {
	
	public static void main(String[] args) {
		int v1=15;
		int v2=10;
		if(v1>10) {
			v2=v1-10;
		}
		int v3=v1+v2+5;
	}
}
