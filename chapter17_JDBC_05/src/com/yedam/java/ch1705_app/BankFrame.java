package com.yedam.java.ch1705_app;

import java.util.*;

import com.yedam.java.ch1705_bank.Bank;
import com.yedam.java.ch1705_bank.BankDAO;
import com.yedam.java.ch1705_bank.BankDAOImpl;

public class BankFrame {
	private Scanner sc = new Scanner(System.in);
	private BankDAO dao = BankDAOImpl.getInstance();

	public BankFrame() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo==1) {
				createBank();
			} else if(menuNo==2) {
				selectBankBalance();
			} else if(menuNo==3) {
				deposit();
			} else if(menuNo==4) {
				withdraw();
			} else if(menuNo==5) {
				transfer();
			} else if(menuNo==9) {
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println("-----------------------------------------------------");
		System.out.println("1.계좌개설 | 2.잔액조회 | 3.입금 | 4.출금 | 5.계좌이체 | 9.종료");
		System.out.println("-----------------------------------------------------");
		System.out.print("선택> ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다");
		}
		return menuNo;
	}
	
	//계좌개설
	private void createBank() {
		// 계좌개설 정보 입력
		Bank bank = inputBankFull();
		
		// DB에 계좌정보 등록
		dao.createBank(bank);
		
		// 계좌번호 출력
		System.out.println("계좌번호: " + dao.selectBankNo(bank));
		
	}
	
	//잔액조회
	private void selectBankBalance() {
		// 조회할 계좌정보 입력 -> inputBankInfo()
		// 계좌정보 정확여부 확인(계좌번호 및 비밀번호) -> checkBankInfo();
		Bank bank = checkBankInfo(inputBankInfo());
		// 해당 계좌 잔액 조회(계좌번호와 비밀번호가 정확할 경우)
		if( bank != null) {
			System.out.println(dao.selectBankInfo(bank.getBankNo()));
		}
	}
	
	//입금
	private void deposit() {
		// 조회할 계좌정보 입력 -> inputBankInfo()
		// 계좌정보 정확여부 확인(계좌번호 및 비밀번호) -> checkBankInfo();
		Bank bank = checkBankInfo(inputBankInfo());
		
		if(bank != null) {
			//입금액이 1원이상인지 확인 -> inputBmount()
			bank.setBankBalance(inputBmount());
			//해당 계좌에 입금처리
			dao.updateBank(bank);
		}
	}

	//출금
	private void withdraw() {
		// 조회할 계좌정보 입력 -> inputBankInfo()
		// 계좌정보 정확여부 확인(계좌번호 및 비밀번호) -> checkBankInfo();
		Bank bank = checkBankInfo(inputBankInfo());
		// 해당계좌의 잔액 존재 확인
		if(bank != null) {
			if(bank.getBankBalance() > 0) {
				// 요청한 출금액인 1원이상인지 확인 -> inputBmount()
				// 요청한 출금액이 잔액보다 작은지 확인 -> checkBmoun()
				long bmount = checkBmount(bank.getBankBalance(), inputBmount());
				// 해당 계좌에서 출금처리
				bank.setBankBalance(-bmount);
				dao.updateBank(bank);
			} else {
				System.out.println("잔액이 존재하지 않습니다.");
			}
		}
	}

	//이체
	private void transfer() {
		// 조회할 계좌정보 입력 -> inputBankInfo()
		// 계좌정보 정확여부 확인(계좌번호 및 비밀번호) -> checkBankInfo();
		Bank bank = checkBankInfo(inputBankInfo());
		// 해당 계좌의 잔액 존재 확인
		if(bank != null) {
		// 상대방 계좌정보 입력 후 정보의 정확성 확인
			Bank selectBank = checkSelectBank();
			if(selectBank != null) {
				// 이체할 금액이 출금할 계좌의 잔액보다 작은지 확인
				long bmount = checkBmount(bank.getBankBalance(), inputBmount());
				// 출금할 계좌에서 해당 금액을 출금처리
				bank.setBankBalance(-bmount);
				dao.updateBank(bank);
				// 상대방 계좌에는 해당 금액을 입금처리
				selectBank.setBankBalance(bmount);
				dao.updateBank(selectBank);
			} else {
				System.out.println("잔액이 존재하지 않습니다");
			}
		}
		
	}

	//종료
	private void end() {
		System.out.println("프로그램 종료");
	}
	
	//계좌정보 전체 입력
	private Bank inputBankFull() {
		Bank bank = new Bank();
		System.out.print("예금주> ");
		bank.setBankOwner(sc.next());
		System.out.print("패스워드> ");
		bank.setBankPasswd(sc.next());
		System.out.print("예금액> ");
		bank.setBankBalance(checkBalance(sc.nextLong()));
		
		return bank;
	}
	
	//계좌번호 및 비밀번호 입력
	private Bank inputBankInfo() {
		Bank bank = new Bank();
		System.out.print("계좌번호> ");
		bank.setBankNo(sc.nextLong());
		System.out.print("패스워드> ");
		bank.setBankPasswd(sc.next());
		
		return bank;
	}
	
	//금액 확인
	private long inputBmount() {
		System.out.print("금액을 입력해주세요> ");
		return checkBalance(sc.nextLong());
	}
	
	//계좌번호 및 비밀번호 확인 & 반환 메서드
	public Bank checkBankInfo(Bank bank) {
		Bank selectBank = dao.selectBankInfo(bank.getBankNo());
		if(selectBank == null) {
			System.out.println("해당 계좌가 존재하지 않습니다");
			return null;
		} else if(selectBank.getBankPasswd().equals(bank.getBankPasswd())) {
			return selectBank;
		} else {
			System.out.println("비밀번호가 일치하지 않습니다");
			return null;
		}
	}
	
	//입력한 금액이 1 이상인지 확인 메서드
	public long checkBalance(long bmount) {
		if(bmount < 1) {
			System.out.print("금액이 1보다 작습니다.\n다시 입력해주세요> ");
			bmount = sc.nextLong();
		}
		return bmount;
	}
	//계좌의 잔액이 요청한 금액과의 대소관계 확인 메서드
	public long checkBmount(long balance, long bmount) {
		if(balance < bmount) {
			System.out.print("잔액보다 큰 금액입니다. \n다시 입력해주세요> ");
			bmount = sc.nextLong();
		}
		return bmount;
	}
	//상대방 계좌의 존재여부 확인 메서드
	public Bank checkSelectBank() {
		System.out.print("입금할 계좌번호>");
		Bank selectBank = dao.selectBankInfo(sc.nextLong());
		if(selectBank == null) {
			System.out.print("존재하지 않는 계좌번호입니다");
			return null;
		} else {
			return selectBank;
		}
	}
}