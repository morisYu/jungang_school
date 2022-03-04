package chap11.sec03.art05;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no+" �� ��ü�� finalize()�� �����.");
	}
	
	@Override
	public int hashCode() {
		return no;
	}
}
