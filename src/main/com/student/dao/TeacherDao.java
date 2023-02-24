package com.student.dao;

import java.util.HashMap;
import java.util.Map;


import com.student.entities.*;

public class TeacherDao {


	Map<Integer, Teacher> map = new HashMap<>();


	public String saveTeacher(String name, int age, String email, int id, String stream) {
		
		if (stream.equals("civil")) {
			map.put(id, new CivilTeacher(name, age, email, id, stream));
		} else if (stream.equals("mechanical")) {
			map.put(id, new MechanicalTeacher(name, age, email, id, stream));
		} else if (stream.equals("electrical")) {
			map.put(id, new ElectricalTeacher(name, age, email, id, stream));
		}
		return "Teacher added successfully";
	}
	
	public Object getTeacher(int id) {	
		
		return map.get(id);
	}
	
	public String updateTeacherName(int id, String name ) {	
		
		Teacher o = map.get(id);
		o.setName(name);
		return o.getName();
	}
	
	public int updateTeacherAge(int id, int age) {

		Teacher o = map.get(id);
		o.setAge(age);
		return o.getAge();
	}
	
	public String updateTeacherEmail(int id, String email) {
		
		Teacher o = map.get(id);
		o.setEmail(email);
		return o.getEmail();
	}
	
	public String deleteTeacher(int id) {
		map.remove(id);
		return "Teacher deleted successfully";
	}
	
}
