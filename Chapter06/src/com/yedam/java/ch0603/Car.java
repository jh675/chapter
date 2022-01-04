package com.yedam.java.ch0603;

public class Car {
	//필드
	int gas;
	//생성자
	
	//메서드
	
	//외부에서 gas필드를 수정
	void setGas(int gas) {
		this.gas = gas;
	}
	//가스 잔량엽주 확인
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	//자동차 운행 메서드
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("가스 잔량: " + gas);
				gas -=1;
			} else {
				System.out.println("가스잔량이 없습니다");
				return;
			}
		}
	}
	
	
	
	
	
	
	
}
