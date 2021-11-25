package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG그램", 900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
	}

}
