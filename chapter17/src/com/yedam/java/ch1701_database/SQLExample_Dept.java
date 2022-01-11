package com.yedam.java.ch1701_database;

import java.sql.*;

public class SQLExample_Dept {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		// 2.DB 서버 접속
		String url = "jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);
		
		/**************************** INSERT ****************************/
		// 3-1.Statement or PreparedStatement 객체 생성
		String insert = "INSERT INTO departments VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Yedam");
		pstmt.setInt(3, 101);
		pstmt.setInt(4, 2500);

		// 4-1.SQL 실행
		int result = pstmt.executeUpdate();

		// 5-1.결과 출력 or 연산
		System.out.println("insert결과: " + result);
		
		/**************************** SELECT ****************************/
		// 3-2.Statement or PreparedStatement 객체 생성
		String select = "SELECT * FROM departments ORDER BY department_id";
		pstmt = conn.prepareStatement(select);

		// 4-2.SQL 실행
		ResultSet rs = pstmt.executeQuery();

		// 5-2.결과 출력 or 연산
		while(rs.next()) {
			String dept = 
					"부서번호: " + rs.getInt("department_id") +
					" " + "부서명: " + rs.getString("department_name");
			System.out.println(dept);
		}

		/**************************** UPDATE ****************************/
		// 3-3.Statement or PreparedStatement 객체 생성
		String update = "UPDATE departments SET department_name = ? WHERE department_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Yedam_JAVA");
		pstmt.setInt(2, 1000);

		// 4-3.SQL 실행
		result = pstmt.executeUpdate();

		// 5-3.결과 출력 or 연산
		System.out.println("update결과: " + result);

		/**************************** SELECT ****************************/
		// 3-2_1.Statement or PreparedStatement 객체 생성
		String select_up = "SELECT * FROM departments ORDER BY department_id";
		pstmt = conn.prepareStatement(select_up);

		// 4-2_1.SQL 실행
		rs = pstmt.executeQuery();

		// 5-2_1.결과 출력 or 연산
		while(rs.next()) {
			String dept = 
					"부서번호: " + rs.getInt("department_id") +
					" " + "부서명: " + rs.getString("department_name");
			System.out.println(dept);
		}
		/**************************** DELETE ****************************/
		// 3-4.Statement or PreparedStatement 객체 생성
		String delete = "DELETE FROM departments WHERE department_id = ?";
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
		
		// 6.자원 해제
		if(rs != null) rs.close(); //ResultSet의 연결을 끊는다.
		if(pstmt != null) pstmt.close(); //Statement의 연결을 끊는다.
		if(conn != null) conn.close(); //Connection의 연결을 끊는다.
	}

}
