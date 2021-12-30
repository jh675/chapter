package com.yedam.java.example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		int total = 0;
		int menuNo;
		
		//비밀번호 입력
		System.out.println("비밀번호를 입력해주세요");
		int passwd = scanner.nextInt();
		if(passwd == 1234) {
			//ATM기 - 입금, 출금, 잔액조회, 종료
			while(run) {
				System.out.println("----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("----------------------------");
				System.out.print("선택> ");
				menuNo = scanner.nextInt();
				
				//1. 입금, 출금, 잔액조회 -> 비밀번호(1234)로 정보확인	
					switch(menuNo) {
					case 1: //예금
						System.out.print("예금액> ");
						balance = scanner.nextInt();
						total += balance;
						break;
					//2. 출금할 때 잔액보다 많을 경우 안내문구 출력.
					case 2: //출금
						System.out.print("출금액> ");
						balance = scanner.nextInt();
						if( total-balance < 0) {
							System.out.println("잔액이 부족합니다");
						} else {
							total -= balance;
						}
						break;
					case 3: //잔고
						System.out.println("잔고> " + total);
						break;
					case 4: //프로그램 종료
						run = false;
						break;
					}
				}
			} else {
			System.out.println("비밀번호가 틀립니다.");
		}
		System.out.println("프로그램 종료");
	}

}
