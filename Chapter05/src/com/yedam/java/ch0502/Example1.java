package com.yedam.java.ch0502;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//예제1 - 주어진 ㅣ배열 안의 값을 전부 더한 값과 평균을 출력
		int[] arr1 = {10, 20, 30, 50, 3, 60, -5};
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum +=arr1[i];
		}
		int avg = sum/arr1.length;
		System.out.println(sum + ", " + avg);
		
		
		//예제2 - 주어진 배열 안의 값 중 인덱스가 2의 배수인 값을 출력.
		for(int i = 0; i < arr1.length; i++) {
			if(i%2 == 0) {
				System.out.println(arr1[i]);
			}
		}
		
		//예제3 - 인덱스번호 2개를 입력받아 그 값을 바꿔보세요.
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3;
		if(num1 != num2) {
			num3 = arr1[num1];
			arr1[num1] = arr1[num2];
			arr1[num2] = num3;
			for(int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + "\t");
			}
		}
	}

}
