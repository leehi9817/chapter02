package com.javaex.ex09;

public class MyMath {

	private static double PI = 3.14;
	
	//static �޼ҵ�
	//: MyMath.plus(a, b)
	//: Ŭ������ �ε��� �� ���α׷��� ����� ������ ����
	
	//�޼ҵ� �����ε�
	//: �Ȱ��� �̸��� �޼ҵ带 ������ ������ �� �ִ�
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
