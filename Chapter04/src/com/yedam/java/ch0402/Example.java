package com.yedam.java.ch0402;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//for 문
		//예제1 _ 0~90까지 10단위로 출력
		for(int i = 0; i <= 90; i += 10) {
			System.out.println(i);
		}
		
		System.out.println("---------------구분선---------------");
		//예제2 _ 0~20까지 짝수만 출력
		for(int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("---------------구분선---------------");
		//예제3 _ 숫자 5번을 입력하고 입력받을때마다 더해지는 값을 출력.
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요.");
			int a = scanner.nextInt();
			sum += a;
			System.out.println("출력: " + sum);
		}
		
		System.out.println("---------------구분선---------------");
		//예제4 _ 1부터 사용자가 입력한 숫자까지의 합계를 출력.
		int x = scanner.nextInt();
		sum = 0;
		for(int i = 0; i <= x; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}