package com.java.sec03b;

public class Outter {

	// Java7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;  // final Ư���� ������ ������ ���� �Ұ�
		// localVariable = 100;  // final Ư���� ������ ������ ���� �Ұ�

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// Java8 ����(7 ������ final �κ� ���������� final Ư���� ������ ������ �� ���� �Ұ�)
	public void method2(int arg) {
		int localVariable = 1;

//		arg = 100;
//		localVariable = 100;

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
