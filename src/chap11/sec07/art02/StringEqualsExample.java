package chap11.sec07.art02;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		// �� String ��ü�� �ٸ� �ּҰ��� �������� ������ ������ hashCode �� ���� ����
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		
		// identityHashCode() �޼ҵ�� String ��ü �ּ� Ȯ��
		System.out.println(System.identityHashCode(strVar1));
		System.out.println(System.identityHashCode(strVar2));
		
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 �� strVar2�� ���� ��ü�� ����");
		}else {
			System.out.println("�ٸ� ��ü�� ����");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 �� strVar2�� ���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}
}
