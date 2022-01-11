package com.yedam.java.ch1701_database;

import java.sql.*;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC"); //org.sqlite.JDBC를 읽어들인다.

		// 2.DB 서버 접속
		String url = "jdbc:sqlite:/C:/new/workspace/YedamDataBase.db"; //읽어들일 DB의 url을 입력한다.
		Connection conn = DriverManager.getConnection(url); //conn에 저장한 커넥션의 url 저장한다.
		
		// 3.Statement or PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		
		// 4.SQL 실행
		String select = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(select); //ResultSet는 매개변수에 대한 결과값을 받아온다.
		
		// 5.결과 출력 or 연산
		while(rs.next()) {
			String name = "이름: " + rs.getString("first_name")
								+ " " + rs.getString("last_name");
			System.out.println(name);
		}
		// 6.자원 해제
		if(rs != null) rs.close(); //ResultSet의 연결을 끊는다.
		if(stmt != null) stmt.close(); //Statement의 연결을 끊는다.
		if(conn != null) conn.close(); //Connection의 연결을 끊는다.
	}

}