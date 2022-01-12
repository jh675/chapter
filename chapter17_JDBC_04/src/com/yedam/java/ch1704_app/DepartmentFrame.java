package com.yedam.java.ch1704_app;

import java.util.*;

import com.yedam.java.ch1704_dept.Department;
import com.yedam.java.ch1704_dept.DepartmentDAO;
import com.yedam.java.ch1704_dept.DepartmentDAOImpl;

public class DepartmentFrame {
	private DepartmentDAO deptDAO = DepartmentDAOImpl.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	public DepartmentFrame() {
		while(true) {
			//메뉴 출력
			menuPrint();
			
			//메뉴 선택
			int menuNo = menuSelect();
			
			//각 메뉴별 기능 실행
			if(menuNo == 1) { 		 //등록
				insertDepartment();
			} else if(menuNo == 2) { //수정
				updateDepartment();
			} else if(menuNo == 3) { //삭제
				deleteDepartment();
			} else if(menuNo == 4) { //부서 조회
				searchDepartment();
			} else if(menuNo == 5) { //모든 부서 조회
				selectAllDepartment();
			} else if(menuNo == 9) { //종료
				end();
				break;
			} 
		}
	}

	private void insertDepartment() {
		// TODO Auto-generated method stub
		Department dept = inputDepartmentInfo();
		deptDAO.insert(dept);
		
	}

	private Department inputDepartmentInfo() {
		// TODO Auto-generated method stub
		Department dept = new Department();
		System.out.print("부서번호> ");
		dept.setDeptId(sc.nextInt());
		System.out.print("부서명> ");
		dept.setDeptName(sc.next());
		System.out.print("매니저번호> ");
		dept.setManagerId(sc.next());
		System.out.print("지역번호> ");
		dept.setLocationId(sc.nextInt());
		
		return dept;
	}

	private void updateDepartment() {
		// TODO Auto-generated method stub
		Department dept = inputDepartmentManager();
		deptDAO.update(dept);
	}

	private Department inputDepartmentManager() {
		Department dept = new Department();
		System.out.print("부서번호> ");
		dept.setDeptId(sc.nextInt());
		System.out.print("매니저번호> ");
		dept.setManagerId(sc.next());
		
		return dept;
	}

	private void deleteDepartment() {
		// TODO Auto-generated method stub
		int dept = inputDepartmentID();
		deptDAO.delete(dept);
	}

	private void searchDepartment() {
		// TODO Auto-generated method stub
		
		//부서 번호 입력
		int deptId = inputDepartmentID();
		
		//부서정보 조회
		Department dept = deptDAO.search(deptId);
		
		//부서정보 출력
		if(dept == null) {
			System.out.println("해당 부서의 정보가 없습니다");
		} else {
			System.out.println(dept);
		}
	}

	private void selectAllDepartment() {
		// TODO Auto-generated method stub
		List<Department> list = deptDAO.selectAll();
		for(Department dept : list) {
			System.out.println(dept);
		}
	}

	private void end() {
		// TODO Auto-generated method stub
		System.out.println("프로그램 종료!");
	}

	private int inputDepartmentID() {
		System.out.print("사원번호> ");
		int deptId = sc.nextInt();
		
		return deptId;
	}

	private void menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------------------");
		System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.부서조회 | 5.모든 부서 조회 | 9.종료");
		System.out.println("-------------------------------------------------------");
		
		System.out.print("선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch(Exception e) {
			System.out.println("해당 메뉴는 없는 메뉴 입니다.");
		}
		return menuNo;
	}

}
