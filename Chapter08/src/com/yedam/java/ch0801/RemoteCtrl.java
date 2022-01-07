package com.yedam.java.ch0801;

public interface RemoteCtrl {
	//상수
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메서드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
