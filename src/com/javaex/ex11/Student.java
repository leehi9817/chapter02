package com.javaex.ex11;

public class Student extends Person {

	//필드
	private String schoolName;

	//생성자
	public Student() {
		//Person() -> Student()
		super(); //쓰지 않으면 자동 호출
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		//Person() -> Student(1)
		super(); //쓰지 않으면 자동 호출
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student (String name, int age, String schoolName) {
		/* Person() -> Student(3) 
		super();
		super.setName(name);
		super.setAge(age);
		*/
		
		//Person(2) -> Student(3)
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	//메소드 - g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 - 일반
	//재정의
	//같은 이름의 메소드가 부모에도 있을 경우 자식의 메소드 사용
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}
	
	//재정의
	//같은 이름의 메소드가 부모에도 있을 경우 자식의 메소드 사용
	public void showInfo() {
		System.out.println("=======================");
		System.out.println("이름:" + super.getName());
		System.out.println("나이:" + super.getAge());
		System.out.println("학교:" + this.schoolName);
		System.out.println("=======================");
		System.out.println("");
	}

}
