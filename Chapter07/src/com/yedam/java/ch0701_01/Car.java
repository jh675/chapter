package com.yedam.java.ch0701_01;

public class Car {
	//필드
	public int speed;
	//메서드
	public void speedUp() {
		speed+=1;
	}
	public final void stop() {
		System.out.println("stop");
		speed = 0;
	}
}
