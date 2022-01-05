package com.yedam.java.example1;

public class SubWay {
	//필드
	private String subwayNumber;
	private int money;
	
	//생성자
	public SubWay(String subwayGreen) {
		this.subwayNumber = subwayGreen;
	}
	
	public void take(int money) {
		this.money += money;
		
	}
	
	//메서드
	public void showInfo() {
		System.out.println("지하철은: " + subwayNumber + "이며 수입은" + money);
	}
}
