package com.javaex.ex12;

public class ColorPoint extends Point {
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		super();
		System.out.println("Color()");
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
		System.out.println("Color(1)");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("Color(3)");
	}

	//메소드 g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	
	public void showInfo() {
		System.out.println("=======================");
		System.out.println("x:" + super.x);
		System.out.println("y:" + super.y);
		System.out.println("색깔:" + this.color);
		System.out.println("=======================");
		System.out.println("");
	}
}
