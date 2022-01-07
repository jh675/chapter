package com.yedam.java.map;

import java.util.*;

public class HashMapExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "김진환"), 95);
		map.put(new Student(1, "김진환"), 95);
		
		System.out.println(new Student(1, "김진환").hashCode());
		System.out.println("김진환".hashCode() + 1);
		
		System.out.println("Entry: " + map.size());
	}

}
