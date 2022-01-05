package com.yedam.java.package1;

// class A { // default 접근제한

public class A {
	
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) { //패키지가 달라도 프로젝트가 같으면 사용 가능
		
	}
	
	A(int b) { //같은 패키지 내에 한해 사용 가능
		
	}
	
	private A(String b) { //해당 클래스의 내부에서만 사용 가능
		
	}
	
	//
	
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메서드
	public void method1() {}
	void method2() {}
	private void method3() {}
}