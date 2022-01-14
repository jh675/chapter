package com.yedam.java.ch1705_bank;

import java.sql.*;

import com.yedam.java.ch1705_common.DAO;

public class BankDAOImpl extends DAO implements BankDAO {
	private static BankDAO instance = new BankDAOImpl();
	private BankDAOImpl() {}
	public static BankDAO getInstance() {
		return instance;
	}

	@Override
	public Bank selectBankInfo(long bankNo) {
		// TODO Auto-generated method stub
		Bank bank = null;
		try {
			connect();
			String select = "SELECT * FROM bank WHERE bank_no = ?";
			pst = conn.prepareStatement(select);
			pst.setLong(1, bankNo);
			
			rs = pst.executeQuery();
			
			if(rs.next()) {
				bank = new Bank();
				bank.setBankNo(rs.getLong("bank_no"));
				bank.setBankOwner(rs.getString("bank_owner"));
				bank.setBankPasswd(rs.getString("bank_passwd"));
				bank.setBankBalance(rs.getLong("bank_balance"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			disconnect();
		}
		return bank;
	}

	@Override
	public long selectBankNo(Bank bank) {
		// TODO Auto-generated method stub
		long bankNo = 0;
		try {
			connect();
			String select = "SELECT bank_no FROM bank WHERE bank_owner = ? AND bank_passwd = ? ORDER BY bank_no DESC";//bank 테이블에서 bank_owner와 bank_passwd가
																													//일치하는 사람들의 bank_no를 표기.(DESC로 내림차순을 적용)
			pst = conn.prepareStatement(select);
			pst.setString(1, bank.getBankOwner());
			pst.setString(2, bank.getBankPasswd());
			
			rs = pst.executeQuery();
			if(rs.next()) {
				bankNo = rs.getLong("bank_no");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return bankNo;
	}

	@Override
	public void createBank(Bank bank) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO bank (bank_owner, bank_passwd, bank_balance) VALUES(?, ?, ?)";
			pst = conn.prepareStatement(insert);
			pst.setString(1, bank.getBankOwner());
			pst.setString(2, bank.getBankPasswd());
			pst.setLong(3, bank.getBankBalance());
			
			int result = pst.executeUpdate();
			
			if( result > 0 ) {
				System.out.println("계좌가 정상적으로 개설 되었습니다");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateBank(Bank bank) {
		// TODO Auto-generated method stub
		try {
			connect();
			String update = "UPDATE bank SET bank_balance = bank_balance + ? WHERE bank_no = ?";
			pst = conn.prepareStatement(update);
			pst.setLong(1, bank.getBankBalance());
			pst.setLong(2, bank.getBankNo());
			int result = pst.executeUpdate();
			
			if( result > 0) {
				System.out.println("정상적으로 처리되었습니다");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
