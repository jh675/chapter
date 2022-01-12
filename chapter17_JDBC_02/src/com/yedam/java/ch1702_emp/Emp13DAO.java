package com.yedam.java.ch1702_emp;

import java.sql.*;
import java.util.*;

public class Emp13DAO {
	//DB 연결 정보
	private String jdbc_driver="org.sqlite.JDBC";
	private String jdbc_url="jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
	
	//각 메서드에서 공통적으로 사용하는 필드
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	//싱글톤
	private static Emp13DAO instance = new Emp13DAO() {};
	private Emp13DAO() {}
	public static Emp13DAO getInstance() {
		return instance;
	}

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

	// PreparedStatement 객체 생성
	// SQL 실행
	// 결과 출력 or 연산
	// ->CRUD 메서드
	
	// 전체 조회
	public List<Emp13> selectAll() {
		List<Emp13> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pst = conn.prepareStatement(select);
			rs = pst.executeQuery();
			while(rs.next()) {
				Emp13 emp = new Emp13();
				emp.setEmployeeId(rs.getInt("Employee_id"));
				emp.setFirstName(rs.getString("First_name"));
				emp.setJobId(rs.getString("Job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setCommissionPct(rs.getString("Commission_pct"));
				emp.setDepartmentName(rs.getString("Department_name"));
				emp.setLocationId(rs.getInt("Location_id"));
				
				list.add(emp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
		
	// 단건 조회
	public Emp13 selectOne(int employeeId) {
		Emp13 emp = null;
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?";
			pst = conn.prepareStatement(select);
			pst.setInt(1, employeeId);
			rs = pst.executeQuery();
			if(rs.next()) {
				emp = new Emp13();
				
				emp.setEmployeeId(rs.getInt("Employee_id"));
				emp.setFirstName(rs.getString("First_name"));
				emp.setJobId(rs.getString("Job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setCommissionPct(rs.getString("Commission_pct"));
				emp.setDepartmentName(rs.getString("Department_name"));
				emp.setLocationId(rs.getInt("Location_id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return emp;
	}
	// 등록
	public void insert(Emp13 emp) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			pst = conn.prepareStatement(insert);
			pst.setInt(1,emp.getEmployeeId());
			pst.setString(2,emp.getFirstName());
			pst.setString(3,emp.getJobId());
			pst.setInt(4,emp.getSalary());
			pst.setString(5,emp.getCommissionPct());
			pst.setString(6,emp.getDepartmentName());
			pst.setInt(7,emp.getLocationId());
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 수정
	public void update(Emp13 emp) {
		try {
			connect();
			String update = "UPDATE emp13 SET commission_pct = ? WHERE employee_id = ?";
			
			pst = conn.prepareStatement(update);
			pst.setString(1, emp.getCommissionPct());
			pst.setInt(2, emp.getEmployeeId());
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 삭제
	public void delete(int empId) {
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			
			pst = conn.prepareStatement(delete);
			pst.setInt(1, empId);
			
			int result = pst.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
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
