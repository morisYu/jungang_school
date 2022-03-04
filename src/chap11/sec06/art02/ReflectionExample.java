package chap11.sec06.art02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("chap11.sec06.art02.Car");

		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

		System.out.println();

		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[�޼ҵ� ����]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println();
		
		System.out.println("----------------------------");
		System.out.println("[��ӹ޾��� �� ��ü�� �ʵ�, �޼ҵ� ����]");
		System.out.println("----------------------------");
		
		System.out.println("[��� ��ü �ʵ� ����]");
		// getFields() �޼ҵ�� ��ӹ��� �ʵ������� ������ ��(public ���������ڸ�)
		Field[] inheritanceFields = clazz.getFields();
		for (Field field : inheritanceFields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[��� ��ü �޼ҵ� ����]");
		// getMethods() �޼ҵ�� ��ӹ��� �޼ҵ������� ������ ��(public ���������ڸ�)
		Method[] inheritanceMethods = clazz.getMethods();
		for (Method method : inheritanceMethods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	}

	@SuppressWarnings("rawtypes")
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}

class Car extends Vehicle {
	static String name;
	public String ssn;
	public int carAge;

	public Car(String name) {
		super(model, brand);
	}

	public Car(String name, String ssn, int age) {
		super();
	}

	void getMethod1(int age) {

	}

	String setMethod1(String name, String ssn) {
		return name + ssn;
	}
}

class Vehicle {
	static String model;
	static String brand;
	public int vehicleAge;

	public Vehicle() {

	}

	public Vehicle(String model, String brand) {
		Vehicle.model = model;
		Vehicle.brand = brand;
	}

	public void setModel(String model) {
		Vehicle.model = model;
	}

	void getModel(String model) {
		Vehicle.model = model;
	}
}
