package com.yedam.java.ch0604;

public class MainExample {
	
	//필드
	String msg;
	
	//메서드
	void println() {
		System.out.println(this.msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("포르쉐");
		Car car2 = new Car("벤츠");
		
		car1.run();
		car2.run();
		
		System.out.println();
		
		double result = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 20);
		int result3 = Calculator.minus(10, 20);
		int result4 = Calculator.multi(10, 20);
		double result5 = Calculator.devide(10, 20);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		System.out.println();
		
		MainExample main = new MainExample();
		main.msg = "정적 메서드 선언 시 주의할 점.";
		main.println();
		
		System.out.println();
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		if(single1 == single2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 singleton 객체입니다.");
		}
		
		Person p1 = new Person("123456", "김진환");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "121211";
		p1.name = "ㅁㅁㅁ";
		
		System.out.println();
		
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "㎞");
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA + "㎢");
		
	}

}
