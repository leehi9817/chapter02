package com.javaex.ex17;

public abstract class Shape {	//추상메소드를 가지고 있어서 미완성인 부분이 있음
								//Shape 단독으로 인스턴스화 하면 안됨
	
	//필드
	private String lineColor;
	private String fillColor;
	
	//생성자
	public Shape() {

	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	//메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	//자식클래스를 반드시 만들지 않아도 됨
	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor + " 도형을 그렸습니다.");
	}
	
	//area() 만들지 못함
	public abstract double area();	//추상메소드: 내부 코드를 작성할 수 없는 상황
									//자식클래스에서는 꼭 내부코드를 구현해야함

}
