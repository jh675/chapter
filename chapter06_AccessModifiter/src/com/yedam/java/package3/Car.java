package com.yedam.java.package3;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	//생성자
	
	//메서드
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(this.stop == true) {
			this.speed = 0;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
}
