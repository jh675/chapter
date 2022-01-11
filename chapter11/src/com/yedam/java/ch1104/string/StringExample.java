package com.yedam.java.ch1104.string;

import java.io.UnsupportedEncodingException;

public class StringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		System.out.println();

		//charAt()
		String ssn = "123456-1234567";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		System.out.println();
		
		//getBytes()
		String str = "안녕하세요";
		byte[] bytesX = str.getBytes();
		System.out.println("bytesX.length: " + bytesX.length);

		try {
			byte[] bytesY = str.getBytes("EUC-KR");
			System.out.println("byteY.length: " + bytesY.length);
			String strY = new String(bytesY, "EUC-KR");
			System.out.println("bytesY -> strY: " + strY);

			byte[] bytesZ = str.getBytes("UTF-16");
			System.out.println("byteZ.length: " + bytesZ.length);
			String strZ = new String(bytesZ, "UTF-16");
			System.out.println("bytesZ -> strZ: " + strZ);

		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		//indexOf()
		
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("JAVA") != -1) {
			System.out.println("JAVA 포함");
		} else {
			System.out.println("JAVA 포함x");
		}
		
		System.out.println();
		
		//length()
		ssn = "9990900120234";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자릿수 맞음");
		} else {
			System.out.println("주민번호 자릿수 틀림");
		}
		
		System.out.println();
		
		//replace()
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		System.out.println();
		
		//substring()
		
		ssn = "9999991234567";
		
		String firstName = ssn.substring(0, 6);
		String secondName = ssn.substring(6);
		
		System.out.println(firstName);
		System.out.println(secondName);
		
		System.out.println();
		
		//toLowerCase(), toUpperCase()
		String strA = "Java Programming";
		String strB = "JAVA PROGRAMMING";
		
		System.out.println(strA.equals(strB));
		
		String lowerStr1 = strA.toLowerCase();			// String upperStr1 = strA.toUpperCase();
		String lowerStr2 = strB.toLowerCase();			// String upperStr2 = strB.toUpperCase();
		System.out.println(lowerStr1.equals(lowerStr2));// System.out.println(upperStr1.equals(upperStr2));

		System.out.println(strA.equalsIgnoreCase(strB));
		
		System.out.println();
		
		//trim()
		
		String tel1 = "            0";
		String tel2 = "         12         ";
		String tel3 = "345           ";

		String telA = tel1 + tel2 + tel3;
		System.out.println(telA);
		
		String telB = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(telB);
	}

}
