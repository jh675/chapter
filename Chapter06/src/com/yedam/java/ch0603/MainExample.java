package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 호출
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(5, 6);
		System.out.println(result1);
		
		double result2 = cal.devide(10.4, 4.15);
		System.out.println(result2);
		
		//매개변수의 개수를 모를 경우
		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3, 4};
		int result3 = com.sum1(values1);
		System.out.println(result3);
		
		int result4 = com.sum1(new int[] {1, 2, 3, 4, 5, 6});
		System.out.println(result4);
		
		int result5 = com.sum2(new int[] {1, 2, 3, 4});
		System.out.println(result5);
		
		int result6 = com.sum2(new int[] {1, 2, 3, 4, 5, 6});
		System.out.println(result6);
		
		System.out.println();
		
		//return 문
		Car car = new Car();
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("운행이 시작됩니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다");
		} else {
			System.out.println("가스를 주입할 필요가 있습니다.");
		}
		
		//클래스 내부에 메서드 호출
		Calculator cal3 = new Calculator();
		cal3.execute();
		
		System.out.println();
		
		//메서드 오버로딩
		Calculator cal1 = new Calculator();
		
		double dbResult1 = cal1.areaRectangle(10);
		double dbResult2 = cal1.areaRectangle(10,5);
		
		System.out.println(dbResult1);
		System.out.println(dbResult2);
	}

}
