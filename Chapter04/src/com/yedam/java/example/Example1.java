package com.yedam.java.example;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//커피 메뉴 4개와 각 메뉴별의 가격을 출력.
		//사용자가 선택한 커피의 가격들을 합산해서 출력.
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
    
		int total = 0;
		String bill = "************** 영수증 ******************\n\t메뉴\t |\t   가격\n--------------------------------------\n";
		while(run) {
			//메뉴 출력
			System.out.println("*** 커피 메뉴 ***");
			System.out.println("1.아메리카노 2000원");
			System.out.println("2.카페라떼 3500원");
			System.out.println("3.카라멜 마끼아또 5000원");
			System.out.println("4.자바칩 프라프치노 6500원");
			System.out.println("5.메뉴선택 종료");
			//사용자가 선택
			System.out.print("메뉴를 선택해주세요.> ");
			int menuNo = scan.nextInt();
			//선택한 메뉴에 따라 가격 합산.
			switch(menuNo) {
			case 1:
				System.out.println("아메리카노(2000)을 선택했습니다.");
				total += 2000;
				bill +="아메리카노\t\t | 2000원\n";
				break;
			case 2:
				System.out.println("카페라떼(3500)을 선택했습니다.");
				total += 3500;
				bill +="카페라떼\t\t | 3500원\n";
				break;
			case 3:
				System.out.println("카라멜 마끼아또(5000)을 선택했습니다.");
				total += 5000;
				bill +="카라멜 마끼아또\t | 5000원\n";
				break;
			case 4:
				System.out.println("자바칩 프라프치노(6500)을 선택했습니다.");
				total += 6500;
				bill +="자바칩 프라프치노\t | 6500원\n";
				break;
			case 5:
				run = false;
				System.out.print("메뉴 선택을 종료합니다.\n");
				break;
			default:
				System.out.print("잘못된 선택입니다\n");
				break;
			}
		}
		System.out.println(bill);
		System.out.println("--------------------------------------");
		System.out.println("결제하실 금액\t | " + total + "원");
		System.out.println("**************************************");

	}

}
