package com.yedam.java.ch1502;

public class MainExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(6);
		int value = box1.get();
		
		Product<Tv, String> product_tv = new Product<Tv, String>();
		product_tv.setKind(new Tv());
		product_tv.setModel("스마트 TV");
		
		Tv tv = product_tv.getKind();
		String tvModel = product_tv.getModel();
		
		Product<Car, String> product_car = new Product<Car, String>();
		product_car.setKind(new Car());
		product_car.setModel("벤츠");
		
		Car car = product_car.getKind();
		String carModel = product_car.getModel();
	}
}
