package com.yedam.java.ch1003;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance*= money;
	}
	public void withDraw(int money) {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money-balance));
		}
		balance -= money;
	}
}
