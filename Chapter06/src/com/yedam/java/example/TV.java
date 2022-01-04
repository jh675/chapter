package com.yedam.java.example;

public class TV {
	String company;
	int year;
	int inch;
	
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year; 
		this.inch = inch;
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.print(company + "에서 만든" + year + "년형 " + inch + "인치 TV");
	}
}
