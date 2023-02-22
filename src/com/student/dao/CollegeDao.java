package com.student.dao;

import java.util.HashMap;
import java.util.Map;

import com.student.entities.CivilTeacher;
import com.student.entities.College;
import com.student.entities.ElectricalTeacher;
import com.student.entities.MechanicalTeacher;
import com.student.services.TeacherService;
import com.student.services.TeacherServiceImpl;

public class CollegeDao {

	College cg = new College();
	TeacherService ts = new TeacherServiceImpl(); 
	Map<Integer, Integer> map = new HashMap<>();
	
	
	public String payTeacherSalary(int id, String stream) {
		
		if (stream.equals("civil")) {
			CivilTeacher ct  = (CivilTeacher) ts.get(id);
			if (ct == null) {
				return "no such teacher id exists";
			}
			int salary = ct.getSalary();
			int remainingTotalMoney = cg.getTotalMoneyEarned() - salary;
			map.put(id , salary);
			cg.setRemainingMoney(remainingTotalMoney);
			cg.setTotalMoneySpent(salary);
			
			return "salary paid: " + salary;
			
			} else if (stream.equals("mechanical")) {
			
			MechanicalTeacher mt  = (MechanicalTeacher) ts.get(id);
			int salary = mt.getSalary();
			int remainingTotalMoney = cg.getTotalMoneyEarned() - salary;
			map.put(id , salary);
			cg.setRemainingMoney(remainingTotalMoney);
			cg.setTotalMoneySpent(salary);
			
			return "salary paid: " + salary;
			
		} else if (stream.equals("electrical")) {
			ElectricalTeacher et  = (ElectricalTeacher) ts.get(id);
			int salary = et.getSalary();
			int remainingTotalMoney = cg.getTotalMoneyEarned() - salary;
			map.put(id , salary);
			cg.setRemainingMoney(remainingTotalMoney);
			cg.setTotalMoneySpent(salary);
			
			return "salary paid: " + salary;
		}			
		
		return "";
		
	}
	
}
