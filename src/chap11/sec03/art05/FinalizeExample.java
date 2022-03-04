package chap11.sec03.art05;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;

		for (int i = 0; i <= 50; i++) {
			counter = new Counter(i);
			System.out.println(counter.hashCode() + " �� ��ü ����");
			// counter ��ü�� ������� ����
			counter = null;

			// ������ ������(garbage collector) ������ ��û
			System.gc();
		}
	}
}
