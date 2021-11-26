package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {
		
		//Point 객체
		//Point(2)
		Point p = new Point(4, 4);
		p.showInfo();
		
		//ColorPoint 객체 (Point의 자식 클래스)
		//Point() -> Color(1)
		ColorPoint cp1 = new ColorPoint("red");
		cp1.setX(7);
		cp1.setY(7);
		cp1.showInfo();
		
		//Point(2) -> Color(3)
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.showInfo();
		
		//toString 재정의
		System.out.println(p.toString());
		System.out.println(cp2.toString());
	}

}
