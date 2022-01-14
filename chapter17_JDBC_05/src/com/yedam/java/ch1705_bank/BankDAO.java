package com.yedam.java.ch1705_bank;

public interface BankDAO {
	//계좌조회
	public Bank selectBankInfo(long bankNo);
	
	//계좌개설 즉시 계좌번호 조회
	public long selectBankNo(Bank bank);
	
	//계좌개설
	public void createBank(Bank bank);
	
	//계좌잔액 수정
	public void updateBank(Bank bank);
}
