package com.javaex.ex08;

public class Goods {
	
	//�ʵ�
	private String name;
	private int price;
	private static int totalCount;
	
	//������
	public Goods() {
		this.totalCount++;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalCount++;
	}

	//�޼ҵ� - g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	//�޼ҵ� - �Ϲ�
	public void showInfo() {
		System.out.println("��ǰ�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
}
