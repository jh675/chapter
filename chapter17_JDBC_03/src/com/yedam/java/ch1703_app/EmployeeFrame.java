package com.yedam.java.ch1703_app;

import com.yedam.java.ch1703_emp.*;

import java.util.*;

public class EmployeeFrame {
	private EmployeeDAO empDAO = EmployeeDAOImpl.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	public EmployeeFrame() {
		while(true) {
			//메뉴 출력
			menuPrint();
			
			//메뉴 선택
			int menuNo = menuSelect();
			
			//각 메뉴별 기능 실행
			if(menuNo == 1) {
				insertEmployee();
			} else if(menuNo == 2) {
				updateEmployee();
			} else if(menuNo == 3) {
				deleteEmployee();
			} else if(menuNo == 4) {
				searchEmployee();
			} else if(menuNo == 5) {
				selectAllEmployee();
			} else if(menuNo == 9) {
				end();
				break;
			}
		}
	}
	
	private void insertEmployee() {
		Employee emp = inputEmployeeInfo();
		empDAO.insert(emp);
	}

	private void updateEmployee() {
		Employee emp = inputEmployeeSalary();
		empDAO.update(emp);
	}

	private void deleteEmployee() {
		int empId = inputEmployeeID();
		empDAO.delete(empId);
	}

	private void searchEmployee() {
		int empId = inputEmployeeID();
		Employee emp = empDAO.search(empId);
		System.out.println(emp);
	}

	private void selectAllEmployee() {
		List<Employee> list = empDAO.selectAll();
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}

	private void end() {
		System.out.println("프로그램 종료!");
	}
	
	public Employee inputEmployeeInfo() {
		Employee emp = new Employee();
		System.out.print("사원번호> ");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		System.out.print("성> ");
		emp.setFirstName(sc.nextLine());
		System.out.print("직업번호> ");
		emp.setJobId(sc.nextLine());
		System.out.print("급여> ");
		emp.setSalary(Integer.parseInt(sc.nextLine()));
		System.out.print("상여금> ");
		emp.setCommissionPct(sc.nextLine());
		System.out.print("부서명> ");
		emp.setDepartmentName(sc.nextLine());
		System.out.print("지역번호> ");
		emp.setLocationId(Integer.parseInt(sc.nextLine()));
		
		return emp;
	}
	
	public Employee inputEmployeeSalary() {
		Employee emp = new Employee();
		System.out.print("사원번호> ");
		emp.setEmployeeId(sc.nextInt());
		System.out.print("급여> ");
		emp.setSalary(Integer.parseInt(sc.nextLine()));
		
		return emp;
	}
	
	public int inputEmployeeID() {
		System.out.print("사원번호> ");
		int employeeId = Integer.parseInt(sc.nextLine());
		
		return employeeId;
	}

	public void menuPrint() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.사원조회 | 5.전체조회 | 9.종료");
		System.out.println("--------------------------------------------------");
		
		System.out.print("선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("해당 메뉴는 없는 메뉴 입니다.");
		}
		return menuNo;
	}
}
