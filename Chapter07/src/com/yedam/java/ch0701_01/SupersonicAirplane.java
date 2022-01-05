package com.yedam.java.ch0701_01;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행");
		} else {
			super.fly(); // Airplane의 fly() 메서드
		}
	}
	
	
}
