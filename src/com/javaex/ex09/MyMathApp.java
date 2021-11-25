package com.javaex.ex09;

public class MyMathApp {

	public static void main(String[] args) {
		
		//메소드가 static일 때
		int sum01 = MyMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = MyMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = MyMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = MyMath.plus(20, 99.9);
		System.out.println(sum04);
				
		double sum05 = MyMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = MyMath.circle(5);
		System.out.println(sum06);
		
		/*
		 * 메소드가 static이 아닐 때
		MyMath myMath = new MyMath(); 
		
		
		int sum01 = myMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = myMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = myMath.plus(20, 99.9);
		System.out.println(sum04);
		*/
	}

}
