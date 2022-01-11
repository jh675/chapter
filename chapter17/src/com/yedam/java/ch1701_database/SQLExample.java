package com.yedam.java.ch1701_database;

import java.sql.*;

public class SQLExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// 1.JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		// 2.DB 서버 접속
		String url = "jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);
		
		/**************************** INSERT ****************************/
		// 3-1.Statement or PreparedStatement 객체 생성
			// String insert = "INSERT INTO employees VALUES (" + id + ", /'" + name + "/" + ",)"; //Statement
		String insert = "INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; //PreparedStatement. set은 ?의 갯수만큼 입력해줘야 한다.
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Red");
		pstmt.setString(3, "Star");
		pstmt.setString(4, "SEUPONLI");
		pstmt.setString(5, "82.10.1234.2468");
		pstmt.setString(6, "99/12/32");
		pstmt.setString(7, "SA_REP");
		pstmt.setInt(8, 15000);
		pstmt.setDouble(9, 0.15);
		pstmt.setInt(10, 149);
		pstmt.setInt(11, 80);
		
		// 4-1.SQL 실행
		int result = pstmt.executeUpdate();
		
		// 5-1.결과 출력 or 연산
		System.out.println("insert결과: " + result);
		
		/**************************** SELECT ****************************/
		// 3-2.Statement or PreparedStatement 객체 생성
		String select = "SELECT * FROM employees ORDER BY employee_id";
		pstmt = conn.prepareStatement(select);

		// 4-2.SQL 실행
		ResultSet rs = pstmt.executeQuery();

		// 5-2.결과 출력 or 연산
		while(rs.next()) {
			String dept = 
					"사원번호: " + rs.getInt("employee_id") +
					" " + "사원명: " + rs.getString("first_name") +
					" " + rs.getString("last_name");
			System.out.println(dept);
		}
		
		/**************************** UPDATE ****************************/
		// 3-3.Statement or PreparedStatement 객체 생성
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Comet");
		pstmt.setInt(2, 1000);
		
		// 4-3.SQL 실행
		result = pstmt.executeUpdate();
		// 5-3.결과 출력 or 연산
		System.out.println("update결과: " + result);
		
		/**************************** SELECT ****************************/
		// 3-2_1.Statement or PreparedStatement 객체 생성
		String select_ins = "SELECT * FROM employees ORDER BY employee_id";
		pstmt = conn.prepareStatement(select_ins);
		
		// 4-2_1.SQL 실행
		rs = pstmt.executeQuery();
		// 5-2_1.결과 출력 or 연산
		while(rs.next()) {
			String name = 
					"사원번호: " + rs.getInt("employee_id") +
					" 이름: " + rs.getString("first_name") +
					" " + rs.getString("last_name");
			System.out.println(name);
		}
		
		/**************************** DELETE ****************************/
		// 3-4.Statement or PreparedStatement 객체 생성
		String delete = "DELETE FROM employees WHERE employee_id =?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 1000);
		
		// 4-4.SQL 실행
		result = pstmt.executeUpdate();
		// 5-4.결과 출력 or 연산
		System.out.println("delete결과: " + result);
		
		// 6.자원 해제
		if(rs != null) rs.close(); //ResultSet의 연결을 끊는다.
		if(pstmt != null) pstmt.close(); //Statement의 연결을 끊는다.
		if(conn != null) conn.close(); //Connection의 연결을 끊는다.
	}

}
