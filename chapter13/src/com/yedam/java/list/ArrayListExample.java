package com.yedam.java.list;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 앞의 숫자는 해당 데이터를 넣을 위치를 지정. 이 경우, 위의 Servlet/JSP는 뒤로 밀려나게 된다.
		list.add("iBATIS");
		list.add("Java");

		int size = list.size();
		System.out.println(size); // list의 객체 수
		String kill = list.get(2); //list의 2번쨰 값을 불러옴.
		System.out.println(kill);

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println("list [" + i + "]: " + str);
		}
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("Java"); //중복되는 경우 가장 위에 있는 것을 제거한다.

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println("list [" + i + "]: " + str);
		}
	}

}
