package com.yedam.java.ch0701_01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널: " + channel + " DMB 방송 수신 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel + "번으로 이동");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료");
	}
}
