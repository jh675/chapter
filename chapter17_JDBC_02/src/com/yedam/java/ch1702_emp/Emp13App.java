package com.yedam.java.ch1702_emp;

import java.util.*;

public class Emp13App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Emp13DAO dao = Emp13DAO.getInstance();
		
		Emp13 emp = null;
		int emp13Id = 0;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.사원조회 | 5.전체조회 | 9.종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택>");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {	
				case 1:
					emp = new Emp13();
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
					dao.insert(emp);
					break;

				case 2:
					emp = new Emp13();
					System.out.print("사원번호> ");
					emp.setEmployeeId(sc.nextInt());
					System.out.print("급여> ");
					emp.setSalary(Integer.parseInt(sc.nextLine()));
					dao.update(emp);
					break;

				case 3:
					emp = new Emp13();
					System.out.print("사원번호> ");
					emp13Id = Integer.parseInt(sc.nextLine());
					
					dao.delete(emp13Id);
					break;

				case 4:
					System.out.print("사원번호> ");
					emp13Id = (Integer.parseInt(sc.nextLine()));
					emp = dao.selectOne(emp13Id);
					System.out.println(emp);
					break;

				case 5:
					List<Emp13> list = dao.selectAll();
					for(Emp13 emp13 : list) {
						System.out.println(emp13);
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
