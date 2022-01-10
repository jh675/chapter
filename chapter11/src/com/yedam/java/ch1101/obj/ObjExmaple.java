package com.yedam.java.ch1101.obj;

import java.util.*;

public class ObjExmaple {
	public static void main(String[] args) {
		//메서드 재정의 전
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("동일 인스턴스");
		} else {
			System.out.println("다른 인스턴스");
		}
		
		if(m1.equals(m3)) {
			System.out.println("동일 인스턴스");
		} else {
			System.out.println("다른 인스턴스");
		}
		
		System.out.println();
		
		Map<Member, Integer> map = new HashMap<Member, Integer>();
		
		map.put(new Member("홍길동"), 100);
		
		Integer score = map.get(new Member("홍길동"));
		System.out.println(score);
		
		System.out.println();
		
		Object obj = new Object();
		System.out.println(obj);
		
		Date date = new Date();
		System.out.println(date);
		
		Member m4 = new Member("김진환");
		System.out.println(m4);
	}
}
