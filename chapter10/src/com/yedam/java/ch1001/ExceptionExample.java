package com.yedam.java.ch1001;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NullPointerException
		String data = null;
//		System.out.print(data.toString());
		
		//ArrayIndexOutOfBoundsException
		/*
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
		*/
		
		/*
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다");
		}
		*/
		
		//NumberFormatException
		/*
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = "+ result);
		*/
		//ClassCastException
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}

}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}