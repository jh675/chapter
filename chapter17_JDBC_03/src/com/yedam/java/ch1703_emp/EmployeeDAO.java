package com.yedam.java.ch1703_emp;

import java.util.*;

public interface EmployeeDAO {
	// 전체 조회
	public List<Employee> selectAll();
	
	// 단건 조회
	public Employee search(int employeeId);
	
	// 등록
	public void insert(Employee emp);
	
	// 수정
	public void update(Employee emp);
	
	// 삭제
	public void delete(int employeeId);
}
