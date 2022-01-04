package com.yedam.java.ch0603;

public class Calculator {
	//전원on
	void powerOn() {
		System.out.println("전원 On");
	}
	
	//전원off
	void powerOff() {
		System.out.println("전원 Off");
	}
	
	//더하기
	int plus(int x, int y) {
		int result = 0;
		result = x + y;
		
		return result;
	}
	
	//나누기
	double devide(double x, double y) {
		double result = 0;
		result = x / y;
		
		return result;
	}
	
	//평균값
	double avg(int x, int y) {
		double result = 0;
		int sum = plus(x, y);
		result = sum / 2.0; // result = (double) sum / 2
		
		return result;
	}
	
	//메세지 출력
	void println(String msg) {
		System.out.println(msg);
	}
	
	//실행
	void execute() {
		double result = avg(7, 10);
		println("" + result);
	}
	
	//정사각형의 넓이
	double areaRectangle(int width) {
		return width * width;
	}
	
	//직사각형의 젋이
	double areaRectangle(int width, int height) {
		return width * height; 
	}
}
