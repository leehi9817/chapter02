package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//해당클래스를 메모리에 올리는 일
	}
	
	public Point(int x, int y) {
		//해당클래스를 메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public void setX(int x) {
		this.x= x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
