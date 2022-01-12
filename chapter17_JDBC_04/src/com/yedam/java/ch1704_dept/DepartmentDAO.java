package com.yedam.java.ch1704_dept;

import java.util.*;

public interface DepartmentDAO {
	// 전체 조회
	public List<Department> selectAll();
	
	// 단건 조회
	public Department search(int deptId);
	
	// 등록
	public void insert(Department dept);
	
	// 수정
	public void update(Department dept);
	
	// 삭제
	public void delete(int deptId);
}
