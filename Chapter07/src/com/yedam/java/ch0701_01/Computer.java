package com.yedam.java.ch0701_01;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle()를 실행");
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}
