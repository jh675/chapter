package com.yedam.java.ch0801;

public class Audio implements RemoteCtrl {
	//필드
	private int volum;
	
	//메서드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio turnOn");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio turnOff");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteCtrl.MAX_VOLUME) {
			this.volum = RemoteCtrl.MAX_VOLUME;
		} else if(volum < RemoteCtrl.MIN_VOLUME) {
			this.volum = RemoteCtrl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
		System.out.println("TV볼륨: " + this.volum);
	}

}
