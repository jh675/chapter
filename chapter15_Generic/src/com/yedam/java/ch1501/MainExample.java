package com.yedam.java.ch1501;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("김진환");
		String name = (String)box.get();
		box.set(new Apple());
		Apple apple = new Apple();
		
	}

}
