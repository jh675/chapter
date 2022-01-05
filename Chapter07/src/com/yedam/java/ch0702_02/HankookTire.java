package com.yedam.java.ch0702_02;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + "Hankook 타이어의 수명: " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "타이어 펑크");
			return false;
		}
	}

	
}
