package com.yedam.java.example;

import java.util.*;

public class MainExample {
	public static void main(String[] args) {
		//문제1. Calculator 클래스 생성 > 사칙연산 메서드 
		Calculator cal = new Calculator();
		
		int result1 = cal.plus(5, 6);
		System.out.println(result1);
		
		int result2 = cal.minus(5, 6);
		System.out.println(result2);
		
		int result3 = cal.mul(5, 6);
		System.out.println(result3);
		
		double result4 = cal.devide(10.4, 4.15);
		System.out.println(result4);
		
		//문제2. TV 클래스 -> 다음과 같은 형태의 생성자와 메서드를 가짐.
		TV tv = new TV("LG", 2017, 32);
		tv.showInfo();
		
		System.out.println();
		//문제3. Grade 클래스 -> 점수를 입력받아 성적 평균을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 정수 입력>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade grade = new Grade(math, science, english);
		
		System.out.println(grade.average());
	}
} 

