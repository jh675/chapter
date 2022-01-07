package com.yedam.java.map;

import java.util.*;

public class HashMapExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김진환", 85);
		map.put("백진석", 90);
		map.put("조형석", 90);
		map.put("김진환", 95); // 키값이 중복될 경우 마지막에 입력된 것을 반영.
		
		System.out.println("Entry: " + map.size());
		
		System.out.println("김진환: " + map.get("김진환"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println("----");
		map.remove("김진환");
		System.out.println("Entry: " + map.size());
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //중첩 인터페이스.
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
	}

}
