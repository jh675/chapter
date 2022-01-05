package com.yedam.java.example1;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		System.out.println();
		
		SubWay subway = new SubWay("2호선"); 
		studentTomas.takeSubway(subway);
		studentTomas.showInfo();
		subway.showInfo();
	}
}
