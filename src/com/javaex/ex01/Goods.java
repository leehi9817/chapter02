package com.javaex.ex01;

public class Goods {
	//�ʵ�
	private String name;
	private int price;
	
	//������
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//�޼ҵ� g/s
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//�޼ҵ� �Ϲ�
	public void showInfo() {
		System.out.println("��ǰ�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
}
