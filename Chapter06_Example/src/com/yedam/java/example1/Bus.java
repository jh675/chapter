package com.yedam.java.example1;

public class Bus {
	
	//필드
	private int busNumber;
	private int money;
	private int passengerCount;
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//메서드
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스: " + busNumber + "번의 승객은 " + passengerCount + "명이며, 수입은" + money);
	}

}