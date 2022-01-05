package com.yedam.java.ch0702_02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.frontRightTire = new HankookTire("앞왼쪽", 15);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
				car.backRightTire = new HankookTire("앞왼쪽", 15);
				break;
			}
			System.out.println();
		}
	}

}
