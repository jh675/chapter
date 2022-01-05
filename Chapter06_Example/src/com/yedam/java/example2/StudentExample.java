package com.yedam.java.example2;

import com.yedam.java.example3.Car;

public class StudentExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentKim = new Student();
		studentKim.setStudentName("김진환");
		System.out.println(Student.getSerialNum());
		System.out.println(studentKim.getStudentName() + "의 학번: " + studentKim.getStudentId());
		
		System.out.println();
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student.getSerialNum());
		System.out.println(studentSon.getStudentName() + "의 학번: " + studentSon.getStudentId());
		
		System.out.println();
	}

}
