package com.student.dao;

import java.util.HashMap;
import java.util.Map;

import com.student.entities.CivilStudent;
import com.student.entities.College;
import com.student.entities.ElectricalStudent;
import com.student.entities.MechanicalStudent;
import com.student.entities.Student;

public class StudentDao {

	Map<Integer, Student> map = new HashMap<>();
	private static final College cg = new College();


	public String saveStudent(String name, int age, String email, int rollNo, String stream) {
		
		if (stream.equals("civil")) {
			map.put(rollNo, new CivilStudent(name, age, email, rollNo, stream));
		} else if (stream.equals("mechanical")) {
			map.put(rollNo, new MechanicalStudent(name, age, email, rollNo, stream));
		} else if (stream.equals("electrical")) {
			map.put(rollNo, new ElectricalStudent(name, age, email, rollNo, stream));
		}
		return "student added successfully";
	}
	
	public Object getStudent(int rollNo) {	
		
		return map.get(rollNo);
	}
	
	public String updateStudentName(int rollNo, String name ) {	
		
		Student o = map.get(rollNo);
		o.setName(name);
		return o.getName();
	}
	
	public int updateStudentAge(int rollNo, int age) {

		Student o = map.get(rollNo);
		o.setAge(age);
		return o.getAge();
	}
	
	public String updateStudentEmail(int rollNo, String email) {
		
		Student o = map.get(rollNo);
		o.setEmail(email);
		
		return o.getEmail();
	}
	
	public String deleteStudent(int rollNo) {
		
		map.remove(rollNo);
		return "student deleted successfully";
	}
	
	public String payStudentFees(int rollNo, String stream, int money) {
			
		if (stream.equals("civil")) {
			CivilStudent o = (CivilStudent) map.get(rollNo);
			if (o.getFees() > o.getPaidFees() && o.getRemainingFees() >= money) {
				o.setPaidFees(o.getPaidFees() + money);
				cg.setTotalMoneyEarned(money);
				return "total fees: " + o.getFees()  + " || fees paid: " + o.getPaidFees() + " || remaining fees: " + o.getRemainingFees();
			}
			
		} else if (stream.equals("mechanical")) {
			MechanicalStudent o = (MechanicalStudent) map.get(rollNo);
			if (o.getFees() > o.getPaidFees() && o.getRemainingFees() >= money) {
				o.setPaidFees(o.getPaidFees() + money);
				cg.setTotalMoneyEarned(money);
				return "total fees: " + o.getFees()  + " || fees paid: " + o.getPaidFees() + " || remaining fees: " + o.getRemainingFees();
			}
		} else if (stream.equals("electrical")) {
			ElectricalStudent o = (ElectricalStudent) map.get(rollNo);
			if (o.getFees() > o.getPaidFees() && o.getRemainingFees() >= money) {
				o.setPaidFees(o.getPaidFees() + money);
				cg.setTotalMoneyEarned(money);
				return "total fees: " + o.getFees()  + " || fees paid: " + o.getPaidFees() + " || remaining fees: " + o.getRemainingFees();
			}
		}		
		return "";
	}
}
