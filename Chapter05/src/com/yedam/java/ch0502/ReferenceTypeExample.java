package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 이용해 배열 생성1
		int[] scores = {84, 90, 78};
		
		/* 
		System.out.println(scores[0]); //배열 중 0번째 값을 출력한다.
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		 */
		
		for(int i = 0; i < 3; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("--------------------------------------------");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균: " + avg);
		
		//값을 이용해 배열 생성2
		int[] scores1;
		scores1 = new int[] {99, 90, 99};
		
		sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores1[i];
		}
		System.out.println("총합: " + sum);
		
		int sum1 =  add(new int[] {96, 90, 96});
		System.out.println(sum1);
		System.out.println("--------------------------------------------");
		//new 연산자로 배열 생성
		int[] arr1 = new int[4];
		for(int i = 0; i < 4; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println("--------------------------------------------");
		arr1[0] = 10;
		arr1[1] = 30;
		arr1[2] = 50;
		arr1[3] = 70;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		
		String[] str2 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + str2[i]);
		}
		
		//배열의 length -> 배열의 크기
		int[] scores3 = {58, 65, 87};
		int sum3 = 0;
		for (int i = 0; i < scores3.length; i++ ) {
			sum3 += scores3[i];
		}
		System.out.println("총합: " + sum3);
		double avg3 = (double)sum3 / 3;
		System.out.println("평균: " + avg3);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum +=scores[i];
		}
		
		return sum;
	}
}