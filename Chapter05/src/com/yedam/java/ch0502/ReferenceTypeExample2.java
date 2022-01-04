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
		
		//for문으로 배열 복사
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int value : newIntArray) {
			System.out.println(value);
		}
		
		//System.arraycopy()로 배열 복사
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String str : newStrArray) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
