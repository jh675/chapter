package com.yedam.java.example3;

public class Car {
	//필드
	private static int serialNum = 1000;
	private int carNum; //차량 번호
	private String carName; //이름
	
	//생성자
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	//메서드
	
	
}
