package com.yedam.java.example;

public class Grade {
	double average = 0;
	int math;
	int science;
	int english;
	
	Grade() {
		
	}
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
		average = (double)(math + science + english) / 3;
	}

	double average() {
		return average;
	}
}
