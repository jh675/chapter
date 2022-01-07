package com.yedam.java.ch03;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야용");

	}

}
