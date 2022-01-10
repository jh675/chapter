package com.yedam.java.ch1103.Class;

import com.yedam.java.ch1101.obj.Member;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Member member = new Member("김진환");
		Class clazz = Class.forName("com.yedam.java.ch1101.obj.Member");
//		Class clazz = member.getClass();

		System.out.println(clazz.getName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getConstructors());
		System.out.println(clazz.getMethods());
	}

}
