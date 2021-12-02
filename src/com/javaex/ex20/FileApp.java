package com.javaex.ex20;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {
		
		FileManager fr = new FileManager();
		
		//throws에서 넘어온 예외를 받아서 처리
		try {
			fr.readFile();
		} catch (IOException e) {
			System.out.println("error");
		}
		
		
	}

}
