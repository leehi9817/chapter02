package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Point p01 = new Point(5,7);
		p01.draw();
		System.out.println(p01.getX());
		
		//Point 클래스의 메소드에 접근 불가
		//오버라이딩한 메소드 draw()만 사용 가능
		Drawable p02 = new Point(114, 117);
		System.out.println(((Point)p02).getX()); //다운캐스팅
		*/
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "빨강", 5, 7);
		Drawable c01 = new Circle("파랑", "파랑", 12);
		Drawable t01 = new Triangle("노랑", "노랑", 22, 55);
		Drawable p01 = new Point(1, 1);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//면적출력
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) { //지금 주소의 인스턴스가 Shape틀에서 만들어졌나?
				//강제로 형변환해서 Shape 클래스 사용 가능
				((Shape)dArray[i]).area();
			}
		}
	}	

}
