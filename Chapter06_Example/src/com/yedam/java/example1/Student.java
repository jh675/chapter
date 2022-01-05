package com.yedam.java.example1;

public class Student {
	
	//필드
	private String name;
	private int money;
	
	//생성자
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메서드
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	public void takeSubway(SubWay subwayGreen) {
		this.money -= 5000;
		subwayGreen.take(5000);
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + "\n남은 금액: " + money);
	}
}
