package com.yedam.java.set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>(); //중복되는 값을 허용하지 않을 때 주로 사용.
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // set은 중복되는 데이터는 저장할 수 없다.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("---");
		
		set.remove("Java");
		set.remove(0); // 위치 지정으로는 삭제할 수 없다.
		
		System.out.println(set.size());
		
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("---");
		
		set.clear(); //set 내부의 모든 데이터를 제거.
		if(set.isEmpty()) {
			System.out.print("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
	}

}
