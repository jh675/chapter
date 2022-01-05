package com.yedam.java.ch0701_01;

public class MainExample {
	public static void main(String[] args) {
		//==클래스 상속
		
		//자식클래스인 DmbCellPhone 인스턴스 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//부모클래스 CellPhone의 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//자식클래스 DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//부모클래스 CellPhone의 메서드
		dmbCellPhone.PowerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.hangUp();
		dmbCellPhone.PowerOff();
		
		//자식클래스 DmbCellPhone의 메서드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(0);
		dmbCellPhone.turnOffDmb();
		
		System.out.println();
		
		//==메서드 재정의
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
		
		System.out.println();
		
		//===부모 메서드 호출
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
