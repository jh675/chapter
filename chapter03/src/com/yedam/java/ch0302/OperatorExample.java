package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -100;
		int result = +a;
		System.out.println("result1: " + result);
		result = -a;
		System.out.println("result2: " + result);
		
		byte b = 127;
		result = -b;
		System.out.println("result3: " + result);
		result = b;
		System.out.println("result4: " + result);
		
		//증감연산자.
		int x = 100;
		int y = 100;
		int z;
		
		System.out.println("-------------------------------------------------");

		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------------------------------------------");

		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-------------------------------------------------");

		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------------------------------");

		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------------------------------");

		z = ++x + y++;
		System.out.println("z = " + z); //203
		System.out.println("x = " + x); //105
		System.out.println("y = " + y); //99
		
		
		x = 50;
		y = 50;
		
		System.out.println("-------------------------------------------------");
		z = ++x + --y;
		System.out.println("z = " + z); //100
		System.out.println("x = " + x); //51
		System.out.println("y = " + y); //49
		
		System.out.println("-------------------------------------------------");
		z = --x + y++;
		System.out.println("z = " + z); //100
		System.out.println("x = " + x); //50
		System.out.println("y = " + y); //50
		
		//논리부정연산자
		boolean play = true;
		System.out.println("-------------------------------------------------");
		System.out.println("논리부정연산자는 변수 앞에 !를 붙여 사용합니다.");
		System.out.println(play + "의 논리부정연산자는 " + !play + "입니다.");
		System.out.println(!play + "의 논리부정연산자는 " + play + "입니다.");
		
		//산술연산자
		System.out.println("-------------------------------------------------");
		int f1 = 5, f2 = 2;
		result= f1 + f2;
		System.out.println("f1 + f2 = " + result);
		
		result= f1 - f2;
		System.out.println("f1 - f2 = " + result);
		
		result= f1 * f2;
		System.out.println("f1 * f2 = " + result);
		
		result= f1 / f2;
		System.out.println("f1 / f2 = " + result);
		
		result= f1 % f2;
		System.out.println("f1 % f2 = " + result);
		
		//문자열 결합 연산자
		System.out.println("-------------------------------------------------");
		String str1 = "JDK " + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		System.out.println("-------------------------------------------------");
		str1 = "JDK " + 3 + 3.0;
		str2 = 3 + 3.0 + " JDK";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("-------------------------------------------------");
		str1 = "JDK " + (3 + 3.0);
		str2 = 3 + 3.0 + " JDK";
		System.out.println(str1);
		System.out.println(str2);
		
		//비교 연산자
		System.out.println("-------------------------------------------------");
		int num1 = 4;
		int num2 = 10;
		boolean iResult = (num1 == num2); //==은 서로 같은 값인가를 묻는 연산자.
		System.out.println(num1 + "과 " + num2 + "이(가) 서로 같은지 비교한 결과 " + iResult + "입니다.");
		
		iResult = (num1 != num2); //!=은 서로 다른 값인가를 묻는 연산자.
		System.out.println(num1 + "과 " + num2 + "이(가) 서로 다른지 비교한 결과 " + iResult + "입니다.");

		iResult = (num1 <= num2); //<=은 num1이 num2보다 작거나 같은가를 묻는 연산자.
		System.out.println(num1 + "이 " + num2 + "보다 작거나 같은지 비교한 결과 " + iResult + "입니다.");
		
		iResult = (num1 >= num2); //>=은 num1이 num2보다 크거나 같은가를 묻는 연산자.
		System.out.println(num1 + "이 " + num2 + "보다 크거나 같은지 비교한 결과 " + iResult + "입니다.");
		
		iResult = (num1 < num2); //<은 num1이 num2보다 작은가를 묻는 연산자.
		System.out.println(num1 + "이 " + num2 + "보다 작은지 비교한 결과 " + iResult + "입니다.");
		
		iResult = (num1 > num2); //>은 num1이 num2보다 큰가를 묻는 연산자.
		System.out.println(num1 + "이 " + num2 + "보다 큰지 비교한 결과 " + iResult + "입니다.");
		
		System.out.println("-------------------------------------------------");
		char char1 = 'A';
		char char2 = 'B';
		boolean cResult = (char1 < char2);
		System.out.println(char1 + "과 " + num2 + "를 비교한 결과" + cResult + "입니다.");
		
		System.out.println("-------------------------------------------------");
		int num3 = 1;
		double num4 = 1.0;
		System.out.println(num3 == num4);
		
		System.out.println("-------------------------------------------------");
		double num5 = 0.5;
		float num6 = 0.5f;
		System.out.println(num5 == num6);
		
		//논리 연산자
		System.out.println("-------------------------------------------------");
		int charCode = 'A';
		int numValue = 11;
		//논리곱( &&연산자 )
		if((charCode > 48) && (charCode < 57)) { //유니코드가 48보다 크며, 57보다 작거나 같으면 숫자. 
			
			System.out.println("숫자 0~9");
			
		} else if((charCode>= 65) && (charCode<=90)) { //유니코드가 65보다 크거나 같으며, 90보다 작거나 같으면 대문자.
			
			System.out.println("대문자");
			
		} else if((charCode >=97) && (charCode<=122)) { //유니코드가 97보다 크거나 같으며, 122보다 작거나 같으면 소문자.
			
			System.out.println("소문자");
			
		}
		//논리합( || 연산자 )
		if((numValue%2==0) || numValue%3==0) { //numValue의 값을 2로 나눠서 나머지가 0이거나 혹은 3으로 나눠서 0이 나올 경우
			System.out.println("2 혹은 3의 배수입니다.");
		}
		
		//대입연산자
		System.out.println("-------------------------------------------------");
		int resultA = 0;
		resultA += 10;
		System.out.println("resultA = resultA+10: " + resultA);
		resultA -= 5;
		System.out.println("resultA = resultA-5: " + resultA);
		resultA *= 4;
		System.out.println("resultA = resultA*4: " + resultA);
		resultA /= 2;
		System.out.println("resultA = resultA/2: " + resultA);
		resultA %= 3;
		System.out.println("resultA = resultA%3: " + resultA);
		
		//삼항연산자
		//삼항 연산식의 공식은 (조건식) ? (참일 때의 값) : (거짓일 때의 값)으로 구성되어 있다.
		System.out.println("-------------------------------------------------");
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.printf("성적은%d이고, 등급은 %c입니다. \n", score, grade);
		
		int age = 27;
		String str = (age > 20) ? "성인" : "미성년자";
		System.out.printf("나이는 %d이고, %s입니다.", age, str);
	}
}