package com.java.sec03;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key key = new Key(1);
		System.out.println(key);
		
		// �ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������.
		hashMap.put(new Key(1), "ȫ�浿");

		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
