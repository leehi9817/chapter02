package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("����", 400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG�׷�", 900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("�ӱ���", 2000);
		System.out.println(cup.toString());
	}

}
