package com.yedam.java.example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random() * 10) + 1; //1부터 10까지의 임의의 숫자 발생
		//3번의 기회 내에 성공 시 성공 문구 출력 & 실패 시 실패 문구 출력
		int life = 3;
		while( life > 0 ) {
			System.out.print("숫자를 입력하세요> ");
			int input = scanner.nextInt();//입력할 숫자.
			if(input == num) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다.");
			}
			life--;
		}
		System.out.println("프로그램을 종료합니다");
		//문구 출력 이후 프로그램 종료
	}

}
