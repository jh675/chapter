package com.yedam.java.ch1702_dept;

import java.util.*;

public class DepartmentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		
		Departments dept = null;
		int deptId = 0;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.부서조회 | 5.전체조회 | 9.종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택>");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {	
				case 1:
					dept = new Departments();
					System.out.print("부서번호> ");
					dept.setDeptId(sc.nextInt());
					System.out.print("부서명> ");
					dept.setDeptName(sc.next());
					System.out.print("매니저번호> ");
					dept.setManagerId(sc.next());
					System.out.print("지역번호> ");
					dept.setLocationId(sc.nextInt());
					dao.insert(dept);
					break;

				case 2:
					dept = new Departments();
					System.out.print("부서번호> ");
					dept.setDeptId(sc.nextInt());
					System.out.print("매니저번호> ");
					dept.setManagerId(sc.next());
					dao.update(dept);
					break;

				case 3:
					System.out.print("부서번호> ");
					deptId = sc.nextInt();
					dao.delete(deptId);
					break;

				case 4:
					System.out.print("부서번호> ");
					deptId = sc.nextInt();
					dept = dao.selectOne(deptId);
					System.out.println(dept);
					break;

				case 5:
					List<Departments> list = dao.selectAll();
					for(Departments department : list) {
						System.out.println(department);
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
