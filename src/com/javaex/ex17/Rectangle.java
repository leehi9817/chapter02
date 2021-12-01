package com.javaex.ex17;

public class Rectangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();	//Shape 기본 생성자
	}

	//부모를 고려해서 생성자를 만든다
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 일반
	//부모쪽에도 같은 메소드가 있다
	//부모쪽의 메소드 사용 못하게 하려고 같은 이름으로 재정의
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	//draw() 메소드를 작성하지 않으면 부모의 draw() 사용하게 됨
	public void draw() {
		System.out.println("선색:" + super.getLineColor() + " 면색:" + super.getFillColor() + " 가로:" + this.width + " 세로:" + this.height + " 사각형을 그렸습니다.");
		
	}
	
	public double area() {	//Shape 클래스를 상속받았음
		double result = width * height;	//Shape를 상속 받으려면 미완성인 부분을 구현해야 함 --> area() 작성하기
		return result;
	}
}
