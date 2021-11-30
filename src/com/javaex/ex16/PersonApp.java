package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		// Person 객체
		Person p01 = new Person("모니카", 38);
		p01.showInfo();
		
		// Student 객체
		Student s01 = new Student("아이키", 35, "올레디고등학교");
		s01.showInfo();
		
		// 섞어쓰기
		Person ps01 = new Student("허니제이", 33, "스우파중학교");
		ps01.showInfo();	// Student의 메소드가 오버라이드
	}

}
