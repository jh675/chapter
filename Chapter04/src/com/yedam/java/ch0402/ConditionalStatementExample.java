package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문
		for(int i = 0; i<=50; i++) {
			//System.out.println(i);
		}
		int sum = 0;
		for(int i=0, j=5000; (i<=2500) && (j>=2500); i++, j++) {
			sum = sum+i+j;
		}
		System.out.println(sum);
		
		System.out.println("--------------------구분선--------------------");
		sum = 0;
		int index = 0;
		for(index = 0; index < 100; index++) {
			sum +=index;
		}
		System.out.println("sum: " + sum + "\nindex: " + index); //index 100

		System.out.println("--------------------구분선--------------------");
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%d x %d = %2d\t", x, y, x*y);
			}
			System.out.println();
		}
		
		//while문
		System.out.println("--------------------구분선--------------------");
		int m =1;
		while(m <= 10) {
			System.out.println(m);
			m++;
		}
		
		sum = 0;
		index = 0;
		while(index <= 100) {
			sum += index;
			index++;
		}
		System.out.println("sum: " + sum + "\nindex: " + index);
		
		index = 1;
		while(index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행되었습니다"); //조건식을 확인한 후, 조건식이 참이 될 경우 실행한다.
		}
		
		//do~while문
		System.out.println("--------------------구분선--------------------");
		do {
			System.out.println("do ~ while 반복문이" + index + "번 실행되었습니다."); // 실행을 한 후, 조건식을 확인한다.
		} while(index != 1);
		//break문
		System.out.println("주사위를 돌리기 시작합니다");
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				System.out.println("주사위의 눈이 6이 나와 break문을 실행합니다.");
				break;
			}
		}
		Outter: for(char upper= 'A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				if(lower=='g') {
					break Outter;
				}
			}
			System.out.println("1)안쪽 for문 종료" + upper);
		}
		System.out.println("1)Outer 종료");
		
		//continue문
		System.out.println("--------------------구분선--------------------");
		for( int i = 0; i <= 10; i++ ) {
			if( i%2 != 0 ) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}