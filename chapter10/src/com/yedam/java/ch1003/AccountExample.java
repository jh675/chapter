package com.yedam.java.ch1003;

public class AccountExample {
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.deposit(10000);
		System.out.print("예금액: " + ac.getBalance());
		
		try {
			ac.withDraw(30000);
		} catch(BalanceInsufficientException e) {
			String msg = e.getMessage();
			e.printStackTrace();
		}
		
	}
}
