package com.javaex.ex02;

public class Point {
	//�ʵ�
	private int x;
	private int y;
	
	//������
	public Point() {
		//�ش�Ŭ������ �޸𸮿� �ø��� ��
	}
	
	public Point(int x, int y) {
		//�ش�Ŭ������ �޸𸮿� �ø��� ��
		this.x = x;
		this.y = y;
	}
	
	//�޼ҵ�
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
		System.out.println("��[x=" + x + ", y=" + y + "]�� �׷Ƚ��ϴ�.");
	}
}
