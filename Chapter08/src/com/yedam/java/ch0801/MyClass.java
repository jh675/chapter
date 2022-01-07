package com.yedam.java.ch0801;

public class MyClass {
	//필드
	RemoteCtrl rc = new Tv();
	
	//생성자
	MyClass() {}
	
	MyClass(RemoteCtrl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드
	void methodA() {
		RemoteCtrl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteCtrl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
