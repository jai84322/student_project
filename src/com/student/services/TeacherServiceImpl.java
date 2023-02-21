package com.student.services;

import com.student.dao.TeacherDao;
import com.student.entities.Teacher;

public class TeacherServiceImpl implements TeacherService {
	
		private static final TeacherDao obj = new TeacherDao();
	
		@Override
		public String add(String name, int age, String email, int id, String stream ) {
			String str = obj.saveTeacher(name, age, email, id, stream);
			return str;
			
		}

		@Override
		public Object get(int id) {
			Object o = obj.getTeacher(id);
			return o;
		}

		@Override
		public String updateName(int id, String name) {
			String str = obj.updateTeacherName(id, name);
			return str;
		}

		@Override
		public int updateAge(int id, int age) {
			int num = obj.updateTeacherAge(id, age);
			return num;
		}

		@Override
		public String updateEmail(int id, String email) {
			String str = obj.updateTeacherEmail(id, email);
			return str;
		}

		@Override
		public String delete(int id) {
			String str = obj.deleteTeacher(id);
			return str;
		}
	
}
