package com.yedam.java.ch1702_dept;

import java.sql.*;
import java.util.*;

public class DepartmentsDAO {
	//DB 연결 정보
	private String jdbc_driver="org.sqlite.JDBC";
	private String jdbc_url="jdbc:sqlite:/C:/new/workspace/YedamDataBase.db";
	
	//각 메서드에서 공통적으로 사용하는 필드
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	//싱글톤
	private static DepartmentsDAO instance = new DepartmentsDAO() {};
	private DepartmentsDAO() {}
	public static DepartmentsDAO getInstance() {
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
		public List<Departments> selectAll() {
			List<Departments> list = new ArrayList<>();
			try {
				connect();
				String select = "SELECT * FROM departments ORDER BY department_id";
				pst = conn.prepareStatement(select);
				rs = pst.executeQuery();
				while(rs.next()) {
					Departments dept = new Departments();
					dept.setDeptId(rs.getInt("department_id"));
					dept.setDeptName(rs.getString("department_name"));
					dept.setManagerId(rs.getString("manager_id"));
					dept.setLocationId(rs.getInt("location_id"));
					
					list.add(dept);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}
		
		// 단건 조회
		public Departments selectOne(int departmentId) {
			Departments dept = null;
			try {
				connect();
				String select = "SELECT * FROM departments WHERE department_id = ?";
				pst = conn.prepareStatement(select);
				pst.setInt(1, departmentId);
				rs = pst.executeQuery();
				if(rs.next()) {
					dept = new Departments();
					
					dept.setDeptId(rs.getInt("department_id"));
					dept.setDeptName(rs.getString("department_name"));
					dept.setManagerId(rs.getString("manager_id"));
					dept.setLocationId(rs.getInt("location_id"));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
			return dept;
		}
		// 등록
		public void insert(Departments dept) {
			// TODO Auto-generated method stub
			try {
				connect();
				String insert = "INSERT INTO departments VALUES(?, ?, ?, ?)";
				
				pst = conn.prepareStatement(insert);
				pst.setInt(1,dept.getDeptId());
				pst.setString(2,dept.getDeptName());
				pst.setString(3,dept.getManagerId());
				pst.setInt(4,dept.getLocationId());
				
				int result = pst.executeUpdate();
				
				System.out.println(result + "건이 등록되었습니다");
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		}
		
		// 수정
		public void update(Departments dept) {
			try {
				connect();
				String update = "UPDATE departments SET manager_id = ? WHERE department_id = ?";
				
				pst = conn.prepareStatement(update);
				pst.setString(1, dept.getManagerId());
				pst.setInt(2, dept.getDeptId());
				
				int result = pst.executeUpdate();
				
				System.out.println(result + "건이 수정되었습니다");
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		}
		
		// 삭제
		public void delete(int deptId) {
			try {
				connect();
				String delete = "DELETE FROM departments WHERE department_id = ?";
				
				pst = conn.prepareStatement(delete);
				pst.setInt(1, deptId);
				
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
