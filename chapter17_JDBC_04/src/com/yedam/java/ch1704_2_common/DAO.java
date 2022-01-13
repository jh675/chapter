package com.yedam.java.ch1704_2_common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	//DB 연결 정보
	private String jdbc_driver="org.sqlite.JDBC";
	private String jdbc_url="jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
	
	//각 메서드에서 공통적으로 사용하는 필드
	public Connection conn = null;
	public PreparedStatement pst = null;
	public ResultSet rs = null;
	
	//메서드
	// JDBC Driver로딩
	// DB 서버 접속
	// ->connect() 메서드
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			
			conn = DriverManager.getConnection(jdbc_url);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}
	// 자원 해제 -> disconnect() 메서드
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(pst != null) pst.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			System.out.println("정상적으로 자원이 해제되지 않았습니다.");
		}
	}
}
