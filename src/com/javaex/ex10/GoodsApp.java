package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("����", 400000);
		goodsArray[0] = camera;
		
		Goods cup = new Goods("�ӱ���", 2000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("LG�׷�",900000);
		goodsArray[2] = computer;
		
		/*
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(computer.toString());
		
		System.out.println(goodsArray[0].toString());
		System.out.println(goodsArray[1].toString());
		System.out.println(goodsArray[2].toString());
		*/
		
		int count = 0;
		
		for (int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].toString());
			count++;
		}
		
		System.out.println(count);
		
		//�̸��� ����ϱ�
		for (int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
		}
	}

}
