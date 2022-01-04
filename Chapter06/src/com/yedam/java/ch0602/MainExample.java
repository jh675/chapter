package com.yedam.java.ch0602;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car1 = new Car("검정", 4000);
		Korean kor1 = new Korean("이름", "주민번호");
		System.out.println(kor1.name);
		System.out.println(kor1.ssn);
		
		Korean kor2 = new Korean("ABC", "Number");
		System.out.println(kor2.name);
		System.out.println(kor2.ssn);
		
		System.out.println();
		Car car1 = new Car();
		System.out.println("제작회사: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("아반떼");
		System.out.println("제작회사: " + car2.company);
		System.out.println("모델: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("소울", "베이지");
		System.out.println("제작회사: " + car3.company);
		System.out.println("모델: " + car3.model);
		System.out.println("색상: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("티볼리", "소울", 200);
		System.out.println("제작회사: " + car4.company);
		System.out.println("모델: " + car4.model);
		System.out.println("색상: " + car4.color);
		System.out.println("최고속도: " + car4.maxSpeed);
		}

}
