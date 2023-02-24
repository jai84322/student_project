package com.student.services;

import com.student.dao.StudentDao;




public class StudentServiceImpl implements StudentService {

	public static final StudentDao obj = new StudentDao();
	
	@Override
	public String add(String name, int age, String email, int rollNo, String stream ) {
		
		String str = obj.saveStudent(name, age, email, rollNo, stream);
		return str;	
	}

	@Override
	public Object get(int rollNo) {
		Object o = obj.getStudent(rollNo);
		return o;
	}
	
	@Override
	public String updateName(int rollNo, String name ) {	
		String str = obj.updateStudentName(rollNo, name);
		return str;
	}

	@Override
	public int updateAge(int rollNo, int age) {
		int num = obj.updateStudentAge(rollNo, age);
		return num;
	}
	
	@Override
	public String updateEmail(int rollNo, String email) {
		String str = obj.updateStudentEmail(rollNo, email);
		return str;
	}
	
	@Override
	public String delete(int rollNo) {
		String str = obj.deleteStudent(rollNo);
		return str;
	}

	@Override
	public String payFees(int rollNo, String stream, int money) {
		String str = obj.payStudentFees(rollNo, stream, money);
		return str;
	}

}
