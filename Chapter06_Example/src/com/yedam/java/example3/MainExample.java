package com.yedam.java.example3;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		Car sonata = factory.createCar();
		Car sonata1 = factory.createCar();
		System.out.println(sonata.getCarNum());
		System.out.println(sonata1.getCarNum());
	}

}
