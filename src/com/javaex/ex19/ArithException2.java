package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {

		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			//ArithmeticException 발생
			//어떤 수를 0으로 나눌 때
			result = 100/num;
			System.out.println(result);
		}catch(ArithmeticException e) {
			//예외 상황이 발생
			//ArithmeticException 클래스의 toString 메소드 호출
			System.out.println(e.toString());
		}finally {
			//예외 상황 발생 여부와 상관없이 무조건 실행
			System.out.println("finally영역");
		}

		sc.close();
		
	}

}
