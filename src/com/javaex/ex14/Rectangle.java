package com.javaex.ex14;

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
	
	public void draw() {
		System.out.println("선색:" + super.getLineColor() + " 면색:" + super.getFillColor() + " 가로:" + this.width + " 세로:" + this.height + " 사각형을 그렸습니다.");
		
	}
	
}
