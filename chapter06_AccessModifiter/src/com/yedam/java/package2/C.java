package com.yedam.java.package2;

import com.yedam.java.package1.*;

public class C {
	A a;
	B b;
	
	//필드
	A a1 = new A(true);
	//A a2 = new A(1);
	//A a3 = new A("문자열");
	
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}

}
