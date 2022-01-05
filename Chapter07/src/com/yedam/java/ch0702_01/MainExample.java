package com.yedam.java.ch0702_01;

public class MainExample {

	public static void main(String[] args) {
		//=== 자동 타입 변환
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1= b;
		A a2= c;
		A a3= d;
		A a4= e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;
		//C c2 = d;
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("");
		
		Parent parent = 
//			new Parent(); 
			child;
		parent.method1();
		parent.method2();
	}

}
