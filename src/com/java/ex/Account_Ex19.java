package com.java.ex;

public class Account_Ex19 {

	// �ʵ�
	private int balance = 0;
	private int money=0;

	// ������

	// �޼ҵ�
	public void setBalance(int balance) {
		if (balance < 0 || balance>1000000) {
			this.balance = 0;
		} else {
			this.balance = balance;
			money=this.balance;
		}
	}
	
	public int getBalance() {
		return money;
	}
}
