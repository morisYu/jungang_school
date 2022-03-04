package chap11.sec03.art04;

public class MemberExample {
	public static void main(String[] args) {
		// ���� ��ü ����
		Member original = new Member("blue","ȫ�浿","12345",25,true,new Car("�ҳ�Ÿ"));
		
		// ���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		// ���� ������ ��� ���� Ÿ�� �ʵ�� ������ �����Ǳ� ������ ���� ��ü�� �ʵ�� ������ ��ü�� �ʵ�� ���� ��ü�� ������.
		// ���� ���������� ���� Ÿ�� �ʵ带 �����ϸ� ������ ��ü �ʵ嵵 ������ ��.
		cloned.car.model="�ڶ���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.age);
		System.out.println("adult: "+cloned.adult);
		System.out.println("* Car��ü �ּ�: "+cloned.car.hashCode());
		System.out.println("* car: "+cloned.car.model);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
		System.out.println("* Car��ü �ּ�: "+original.car.hashCode());
		System.out.println("* car: "+original.car.model);
		
	}
}
