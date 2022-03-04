package chap11.sec06.art03;

public class NewInstanceExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// ���� new �����ڸ� ����ؼ� ��ü ����
		SendAction send = new SendAction();
		ReceiveAction receive = new ReceiveAction();
		System.out.println(send.getClass().getName());
		System.out.println(receive.getClass().getName());

		// Class ��ü�� newInstance() �޼ҵ带 ȣ���ؼ� ���� ��ü ����
		try {
			Class clazz = Class.forName("chap11.sec06.art03.SendAction");
			Class clazz2 = Class.forName("chap11.sec06.art03.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
			Action action2 = (Action) clazz2.newInstance();
			action2.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
