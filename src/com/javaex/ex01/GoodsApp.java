package com.javaex.ex01;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		/*
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		computer.showInfo();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		*/
		
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		System.out.println(cup.toString());
	}
	
}
