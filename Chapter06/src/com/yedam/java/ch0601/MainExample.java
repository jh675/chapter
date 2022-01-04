package com.yedam.java.ch0601;

import java.util.*;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1 변수가 Car 인스턴스를 참조합니다.");
		
		Car car2 = new Car();
		System.out.println("car2 변수가 또 다른 Car 인스턴스를 참조합니다.");
		
		//
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		myCar.speed = 60;
		System.out.println("수정속도: " + myCar.speed);
	}

}