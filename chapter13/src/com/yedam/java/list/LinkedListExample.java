package com.yedam.java.list;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime + "ns"); //ArrayList 프로그램이 실행된 시간.
		
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime + "ns"); //LinkedList 프로그램이 실행된 시간.
	}

}
