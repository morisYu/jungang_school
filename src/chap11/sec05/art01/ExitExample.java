package chap11.sec05.art01;

public class ExitExample {
	public static void main(String[] args) {
		// ���Ȱ����� ����
		// System.exit() �޼ҵ� ���� �� �׻� checkExit() �޼ҵ尡 ȣ���
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			// i �� ���
			System.out.println(i);
			try {
				// JVM ���� ��û
				System.exit(i);
			} catch (SecurityException e) {

			}
		}
	}
}
