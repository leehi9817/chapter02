package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {
	
	//필드: 클래스의 실행부터 끝까지 메모리에 올라가 있음
	private double num;
	
	public static void main(String[] args) {
		
		//변수: main 함수가 실행되는 동안만 메모리에 올라감
		//main 함수가 끝나면 사라짐
		double result;
		int num;
		
		//Scanner 객체를 메모리에 올린다
		Scanner sc = new Scanner(System.in);
		
		//Scanner 클래스의 nextInt 메소드 호출
		num = sc.nextInt();
		
		//java.lang.ArithmeticException 발생
		//어떤 수를 0으로 나눌 때
		result = 100/num;
		
		//예외 발생으로 수행되지 않음
		System.out.println(result);
		
		
		sc.close();
		
	}
	
}
