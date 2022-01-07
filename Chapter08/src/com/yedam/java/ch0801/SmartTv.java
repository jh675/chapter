package com.yedam.java.ch0801;

public class SmartTv implements RemoteCtrl, Searchable {
	//필드
	private int volum;
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv turn On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv turn Off");
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
