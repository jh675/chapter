package com.yedam.java.ch03;

public class Phone {
	//필드
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	//메서드
	
	public void turnOn() {
		System.out.println("Turn ON");
	}
	
	public void turnOff() {
		System.out.println("turn Off");
	}

}
