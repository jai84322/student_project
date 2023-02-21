package com.student.services;

import com.student.dao.CollegeDao;

public class CollegeServiceImpl implements CollegeService {

	CollegeDao obj = new CollegeDao();
	
	@Override
	public String paySalary(int id, String stream) {
		
		String str = obj.payTeacherSalary(id, stream);
		return str;
	}

	
	
}
