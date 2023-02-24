package com.student.entities;


 public class Student  {

	private String name;
	private int age;
	private String email;
	private int rollNo;

	public Student(String name, int age, String email, int rollNo) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.rollNo = rollNo;
	};

	
	public void setName(String name) {
		this.name = name;
	};

	public String getName() {
		return name;
	};

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int num) {
		this.rollNo = num;
	}

	
}
