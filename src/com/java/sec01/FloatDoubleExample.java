package com.java.sec01;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		// float var2 = 3.14; // 컴파일 에러
		float var2_2 = (float) 3.14; //강제 형변환
		float var3 = 3.14f; //실수는 double 타입이 기본 설정이기 때문에 float으로 사용하고 싶으면 숫자 뒤에 'f' 또는 'F'를 붙여야 함

		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;

		System.out.println("var1 = " + var1);
		System.out.println("var2_2 = " + var2_2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);

		// e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}

}
