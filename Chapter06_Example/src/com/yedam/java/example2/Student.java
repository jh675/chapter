package com.yedam.java.example2;

public class Student {
	//필드
	private static int serialNum = 1000;
	private int studentId; //학번
	private String studentName; //이름
	private int grade; //학년
	private String address; //주소
	
	private int cardNum; //카드번호
	
	//생성자
	public Student() {
		serialNum++;
		studentId = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
	//메서드
}
