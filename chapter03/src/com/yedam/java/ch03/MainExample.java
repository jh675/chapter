package com.yedam.java.ch03;

public class MainExample {
	public static void main(String[] args) {
//		Phone phone  = new Phone();
		SmartPhone sma = new SmartPhone("김진환");
		
		sma.turnOn();
		sma.internetSearch();
		sma.turnOff();
		
		System.out.println();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		System.out.println();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
