package chap11.sec03.art01;

import chap11.sec03.art02.Member2;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
		
		System.out.println("----------------------");
		System.out.println("hashCode() �޼ҵ带 ������");
		// hashCode() �޼ҵ� ������
		Member2 obj4 = new Member2("blue");
		Member2 obj5 = new Member2("blue");
		Member2 obj6 = new Member2("red");
		
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		
		if(obj4.equals(obj5)) {
			System.out.println("obj4�� obj5�� �����մϴ�.");
		}else {
			System.out.println("obj4�� obj5�� �������� �ʽ��ϴ�.");
		}
		
		if(obj4.equals(obj6)) {
			System.out.println("obj4�� obj6�� �����մϴ�.");
		}else {
			System.out.println("obj4�� obj6�� �������� �ʽ��ϴ�.");
		}
	}
}
