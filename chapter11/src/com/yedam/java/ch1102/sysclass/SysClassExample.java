package com.yedam.java.ch1102.sysclass;

public class SysClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
//				System.exit(i);
			}
		}
		
		long time1 = System.nanoTime();
		
		long sum = 0;
		for(int i = 0; i <= 100000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("1 ~ 100000000의 합:\t" + sum);
		System.out.println("계산시간:\t\t\t" + (time2 - time1) + "ns");
		
	}

}
