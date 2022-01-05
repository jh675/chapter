package com.yedam.java.ch0702_02;

public class Tire {
	//필드
	public int maxRotation;//최대 회전수
	public int accmulatedRotation;//누적 회전수
	public String location;//타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//매서드
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + "타이어의 수명: " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "타이어 펑크");
			return false;
		}
	}
}
