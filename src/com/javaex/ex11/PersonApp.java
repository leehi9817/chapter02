package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		
		/* Person 객체
		Person p01 = new Person("정우성", 45);
		
		Person p02 = new Person("이정재", 57);
		
		p01.showInfo();
		p02.showInfo();
		*/
		
		//Student 객체
		//Person() -> Student()
		Student s01 = new Student();
		s01.setName("리정");
		s01.setAge(38);
		s01.setSchoolName("스우파고등학교");
		s01.showInfo();
		
		//Person(2) -> Student(3)
		Student s02 = new Student("아이키", 35, "올레디고등학교");
		s02.showInfo();
		
	}
}
