package com.yedam.java.ch0701_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {
		System.out.println("SportsCar stop");
		speed = 0;
	}
	
}
