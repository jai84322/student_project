package com.student.services;

public interface TeacherService {

	public String add(String name, int age, String email, int rollNo, String stream);
	public Object get(int rollNo);
	public String updateName(int rollNo ,String name);
	public int updateAge(int rollNo , int age);
	public String updateEmail(int rollNo , String email);
	public String delete(int rollNo);
	
}
