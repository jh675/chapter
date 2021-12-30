package com.yedam.java.ch0502;

public class ReferenceTypeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//다차원 배열-> 배열의 배열

		int[][] javaScores = { {95,80}, {92,96,80} };
		for(int i = 0; i < javaScores.length; i++) {
			for(int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores ["+i+"]["+j+"]: "+ javaScores[i][j]);
			}
		}
	}
}
