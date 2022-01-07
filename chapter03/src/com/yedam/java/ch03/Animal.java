package com.yedam.java.ch03;

public abstract class Animal {
	//필드
	public String kind;
	
	//메서드
	public void breathe() {
		System.out.println("호흡");
	}
	
	public abstract void sound();
	
	
}
