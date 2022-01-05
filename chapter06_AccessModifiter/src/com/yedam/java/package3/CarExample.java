package com.yedam.java.package3;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setSpeed(-50);
		
		System.out.println(car1.getSpeed());
		
		car1.setSpeed(60);
		System.out.println(car1.getSpeed());
		
		if(!car1.isStop()) {
			car1.setStop(true);
		}
		
		System.out.println(car1.getSpeed());
	}
}
