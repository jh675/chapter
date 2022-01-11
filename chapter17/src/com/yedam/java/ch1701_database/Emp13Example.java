package com.yedam.java.ch1701_database;

import java.sql.*;

public class Emp13Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		
		// 2.DB 서버 접속
		String url = "jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);
		
		/**************************** INSERT ****************************/
		// 3-1.PreparedStatement 객체 생성
		String insert = "INSERT INTO emp13 VALUES(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Yedam");
		pstmt.setString(3, "AD_ASST");
		pstmt.setInt(4, 12000);
		pstmt.setString(5, null);
		pstmt.setString(6, "IT");
		pstmt.setInt(7, 1400);
		// 4-1.SQL 실행
		int result = pstmt.executeUpdate();

		// 5-1.결과 출력 or 연산
		System.out.println("insert결과: " + result);

		/**************************** UPDATE ****************************/
		// 3-2.PreparedStatement 객체 생성
		String update = "UPDATE emp13 SET salary = ? WHERE department_name = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setInt(1, 13000);
		pstmt.setString(2, "Marketing");
		
		// 4-2.SQL 실행
		result = pstmt.executeUpdate();

		// 5-2.결과 출력 or 연산
		System.out.println("update결과: " + result);

		/**************************** SELECT ****************************/
		// 3-3.PreparedStatement 객체 생성
		String select = "SELECT * FROM emp13 ORDER BY employee_id";
		pstmt = conn.prepareStatement(select);
		// 4-3.SQL 실행
		ResultSet rs = pstmt.executeQuery();

		// 5-3.결과 출력 or 연산
		while(rs.next()) {
			String emp = 
					"사원번호: " + rs.getInt("employee_id") + 
					" \t" + "이름: " + rs.getString("first_name") +
					" \t" + "급여: " + rs.getInt("salary");
			System.out.println(emp);
		}

		/**************************** DELETE ****************************/
		// 3-4.PreparedStatement 객체 생성
		String delete = "DELETE FROM emp13 WHERE employee_id = ?";
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
