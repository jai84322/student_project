package com.student.services;

import com.student.dao.CollegeDao;


public class CollegeServiceImpl implements CollegeService {

	CollegeDao cobj = new CollegeDao();
	
	@Override
	public String sortStudentUsingName() {
		
		StudentServiceImpl.obj.sortAllStudentUsingName();
		return "";
	}
	
	
	@Override
	public String sortStudentUsingRollNo() {
		StudentServiceImpl.obj.sortAllStudentUsingRollNo();
		return "";
	}


	@Override
	public String sortStudentUsingAge() {
		StudentServiceImpl.obj.sortAllStudentUsingAge();
		return "";
	}
	


		
	@Override
	public String paySalary(int id, String stream) {
		
		String str = cobj.payTeacherSalary(id, stream);
		return str;
	}
	
}
