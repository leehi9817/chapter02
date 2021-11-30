package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형 전체를 관리할 배열 만들기
		Shape[] sArray = new Shape[3];
		
		//섞어쓰기
		Shape s01 = new Rectangle("빨강", "빨강", 5, 5);
		//s01.draw();	//오버라이드되어 자식(Square) 메소드 호출

		Shape c01 = new Circle("노랑", "노랑", 10);
		//c01.draw(); //오버라이드되어 자식(Square) 메소드 호출
		
		Shape t01 = new Triangle("파랑", "파랑", 20, 20); //오버라이드되어 자식(Square) 메소드 호출
		//t01.draw();
		
		//배열에 도형 넣기
		sArray[0] = s01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		//모든 도형 출력하기
		for(int i=0; i<sArray.length;i++) {
			sArray[i].draw();
		}
	}

}
