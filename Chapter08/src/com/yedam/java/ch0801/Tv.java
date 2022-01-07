package com.yedam.java.ch0801;

public class Tv implements RemoteCtrl {
	//필드
	private int volum;

	//메서드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV turnOn");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV turnOff");
	}

	@Override
	public void setVolume(int volum) {
		// TODO Auto-generated method stub
		if(volum > RemoteCtrl.MAX_VOLUME) {
			this.volum = RemoteCtrl.MAX_VOLUME;
		} else if(volum < RemoteCtrl.MIN_VOLUME) {
			this.volum = RemoteCtrl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
		System.out.println("TV볼륨: " + this.volum);
	}

}
