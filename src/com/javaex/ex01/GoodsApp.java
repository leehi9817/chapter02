package com.javaex.ex01;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods camera = new Goods("����", 400000);
		Goods computer = new Goods("LG�׷�", 900000);
		Goods cup = new Goods("�ӱ���", 2000);
		
		/*
		camera.setName("����");
		camera.setPrice(400000);
		camera.showInfo();
		
		computer.setName("LG�׷�");
		computer.setPrice(900000);
		computer.showInfo();
		
		cup.setName("�ӱ���");
		cup.setPrice(2000);
		cup.showInfo();
		*/
		
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		System.out.println(cup.toString());
	}
	
}
