package chap11.sec03.art02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		Key key = new Key(1);
		System.out.println(key);
		System.out.println(key.hashCode());

		// �ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������.
		hashMap.put(new Key(1), "ȫ�浿");
		System.out.println("hashMap�� ����Ǿ��ִ� Ű, ��");
		System.out.println(hashMap);
		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��.
		String value = hashMap.get(new Key(1));
		System.out.println(value);

		System.out.println("----------------------");
		System.out.println("hashCode() �޼ҵ带 ������");
		// hashCode() �޼ҵ带 �������� Key2 Ŭ���� ���
		HashMap<Key2, String> hashMap2 = new HashMap<Key2, String>();

		Key2 key2 = new Key2(15);
		System.out.println(key2);
		System.out.println(key2.hashCode());

		// �ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������.
		hashMap2.put(new Key2(15), "ȫ�浿");

		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��.
		String value2 = hashMap2.get(new Key2(15));
		System.out.println(value2);
	}
}
