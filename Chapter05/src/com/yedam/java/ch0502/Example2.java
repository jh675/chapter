package com.yedam.java.ch0502;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int students = 0;
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
			int MenuNo = sc.nextInt();
			
			switch(MenuNo) {
			case 1: //학생수를 입력
				System.out.print("학생 수> ");
				students = sc.nextInt();
				scores = new int[students];
				break;
			case 2: //학생 수만큼 점수를 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3: //입력된 점수를 출력
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i +"]: " + scores[i]);
				}
				break;
			case 4: //종합점수와 평균점수를 출력
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
				}
				avg = sum/scores.length; //종합점수에서 학생 수만큼 나눠 평균점수를 구함
				System.out.println("종합 점수: " + sum);
				System.out.println("평균 점수: " + avg);
				break;
			case 5: //프로그램을 종료
				run = false; //while문의 run을 false로 변경.
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
		}
	}
}
