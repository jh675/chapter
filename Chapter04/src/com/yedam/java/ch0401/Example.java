package com.yedam.java.ch0401;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//IF문
		//예제1 _ 정수를 입력받아 70점 이상은 합격, 미만은 불합격 출력.
		/*
		int score = scanner.nextInt();
		if( score >= 70 ) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		*/
		
		//예제2 _ 정수 한개를 입력받아 해당 정수가 2의 배수인지 확인.
		/*
		int x = scanner.nextInt();
		if( x % 2 == 0) {
			System.out.println("2의 배수입니다");
		} else {
			System.out.println("2의 배수가 아닙니다");
		}
		*/
		
		//예제3 _ 점수는 0~100점 사이 값이어야 하며, 벗어날 경우 "점수 입력 오류" 문구를 출력.
		//       60점 이상이면 합격, 미만이면 불합격 문자 출력.
		/*
		int score = scanner.nextInt();
		if ((0 <= score) && (score <= 100)) {
			if( score >= 60 ) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("점수 입력 오류");
		}
		*/
		
		//예제4 _ 키가 110cm이상일 경우 라바 트위스터를 탑승할 수 있으며, 미만일 경우 보호자의 유무 체크.
		//       보호자가 있으면 탑승이 가능하고, 없으면 "보호자와 같이 오세요" 문구를 출력.
		/*
		int height = scanner.nextInt();
		if( height >= 110 ) {
			System.out.println("라바 트위스터를 탑승할 수 있습니다");
		} else {
			System.out.println("부모님이 동반하셨나요?");
			System.out.println("0:혼자 / 1:동행");
			int sel = scanner.nextInt();
			if (sel == 1) {
				System.out.println("라바 트위스터를 탑승할 수 있습니다");
			} else {
				System.out.println("부모님과 함께 오세요");
			}
		}
		*/
		
		//switch문
		//예제1 _ 정수를 입력받아 0일경우 false, 1일경우 true, 그 외에는 "체크오류" 문구 출력
		/*
		int num = scanner.nextInt();
		switch(num) {
			case 0:
				System.out.println("false");
				break;
			case 1:
				System.out.println("true");
				break;
			default:
				System.out.println("체크오류");
				break;
		}
		*/
		//예제2 _ 입력받은 정수가 홀수인지 짝수인지 판별.( default 출력 시 어떤 문자를 출력할 것인가 )
		int num = scanner.nextInt();

		switch(num) {
			case 0:
				System.out.println("짝수입니다");
				break;
			case 1:
				System.out.println("홀수입니다");
				break;
			default:
				System.out.printf("체크 오류");
		}
	}
}
