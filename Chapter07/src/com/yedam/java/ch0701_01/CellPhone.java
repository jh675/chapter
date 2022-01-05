package com.yedam.java.ch0701_01;

public class CellPhone {
	//필드
	String model;
	String color;
	
	//생성자
	
	//메서드
	void PowerOn() {
		System.out.println("Power On!");
	}
	
	void PowerOff() {
		System.out.println("Power Off!");
	}
	
	void bell() {
		System.out.println("알림모드");
	}
	
	void sendVoice(String msg) {
		System.out.println("나: " + msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("상대방: " + msg);
	}
	
	void hangUp() {
		System.out.println("통화 종료");
	}
}
