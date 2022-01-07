package com.yedam.java.lifofifo;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>(); // 자료를 검색하는 것이 아니기 때문에 중복 데이터 허용.
		
		coinBox.push(new Coin(50)); // push는 stack에 넣는 명령어. 
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		
		while(!coinBox.isEmpty()) {
			Coin coin  = coinBox.pop(); //pop는 stack에서 빼내는 명령어.
			System.out.println("동전: " + coin.getValue() + "원");
		}
	}

}
