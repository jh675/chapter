package com.yedam.java.ch1702_vo;

import java.util.*;

public class EmployeeApp {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		EmployeesDAO dao = EmployeesDAO.getInstance();
		
		Employees emp = null;
		int employeeId = 0;
		
		
		while(run) {
			System.out.println("**************************************************");
			System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.사원조회 | 5.전체조회 | 9.종료");
			System.out.println("**************************************************");
			
			System.out.print("선택>");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			
			case 1:
				emp = new Employees();
				System.out.print("사번> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("이름> ");
				emp.setFirstName(sc.next());
				System.out.print("성> ");
				emp.setLastName(sc.next());
				System.out.print("이메일> ");
				emp.setEmail(sc.next());
				System.out.print("연락처> ");
				emp.setPhoneNumber(sc.next());
				System.out.print("입사일> ");
				emp.setHireDate(sc.next());
				System.out.print("직급> ");
				emp.setJobId(sc.next());
				System.out.print("급여> ");
				emp.setSalary(sc.nextInt());
				System.out.print("상여금> ");
				emp.setCommissionPct(sc.next());
				System.out.print("상사> ");
				emp.setManagerId(sc.next());
				System.out.print("부서> ");
				emp.setDepartmentId(sc.next());
				
				dao.insert(emp);
				break;
				
			case 2:
				emp = new Employees();
				System.out.print("사번> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("연봉> ");
				emp.setSalary(sc.nextInt());
				
				dao.update(emp);
				break;
				
			case 3:
				System.out.print("사번> ");
				emp.setEmployeeId(sc.nextInt());
				
				dao.delete(employeeId);
				break;
				
			case 4:
				System.out.print("사번> ");
				employeeId = sc.nextInt();
				emp = dao.selectOne(employeeId);
				System.out.println(emp);
				break;
				
			case 5:
				List<Employees> list = dao.selectAll();
				for(Employees employees : list) {
					System.out.println(employees);
				}
				break;
				
			case 9:
				run = false;
				System.out.println("프로그램 종료!");
				break;
				
			default:
				System.out.println("선택하신 메뉴는 없는 메뉴입니다");
				break;
			}
		}
	}

}
