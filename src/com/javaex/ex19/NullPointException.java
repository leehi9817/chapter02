package com.javaex.ex19;

public class NullPointException {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		System.out.println(str);
		
		try {
			str = null;
			System.out.println(str.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
