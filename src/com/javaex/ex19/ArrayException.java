package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6, 9};

		try {
			//ArrayIndexOutOfBoundsException 발생
			//배열을 참조하는 인덱스가 잘못된 경우
			System.out.println(intArray[3]);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}finally {
			System.out.println("finally 영역");
		}

	}

}
