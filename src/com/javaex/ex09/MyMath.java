package com.javaex.ex09;

public class MyMath {

	private static double PI = 3.14;
	
	//static 메소드
	//: MyMath.plus(a, b)
	//: 클래스가 로딩될 때 프로그램이 종료될 때까지 유지
	
	//메소드 오버로딩
	//: 똑같은 이름의 메소드를 여러개 생성할 수 있다
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}

	public static double circleArea(int radius) {
		return radius * radius * PI;
	}
	
	public static double circle(int radius) {
		return (radius + radius) * PI;
	}
	
}
