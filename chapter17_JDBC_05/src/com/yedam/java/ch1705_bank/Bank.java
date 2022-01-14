package com.yedam.java.ch1705_bank;

public class Bank {
	private long bankNo;
	private String bankOwner;
	private String bankPasswd;
	private long bankBalance;
	
	public long getBankNo() {
		return bankNo;
	}
	
	public void setBankNo(long bankNo) {
		this.bankNo = bankNo;
	}
	
	public String getBankOwner() {
		return bankOwner;
	}
	
	public void setBankOwner(String bankOwner) {
		this.bankOwner = bankOwner;
	}
	
	public String getBankPasswd() {
		return bankPasswd;
	}
	
	public void setBankPasswd(String bankPasswd) {
		this.bankPasswd = bankPasswd;
	}
	
	public long getBankBalance() {
		return bankBalance;
	}
	
	public void setBankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	@Override
	public String toString() {
		return "Bank [계좌번호=" + bankNo + ", 계좌명=" + bankOwner + ", 패스워드=" + bankPasswd + ", 계좌잔액="
				+ bankBalance + "]";
	}
}
