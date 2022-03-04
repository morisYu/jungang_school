package chap11.sec03.art02;

public class Member2 {
	public String id;
	
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	// id ���ڿ��� ���� hashCode�� ����
	// id �� ���� Member2 ��ü�� ��� ���� hashCode �� ����
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
