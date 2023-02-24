package com.student.entities;

public class ElectricalTeacher extends Teacher {
	
	private String stream;
	private int salary;
	
	public ElectricalTeacher( String name, int age, String email, int id, String stream) {
		
		super(name,age,email,id);
		this.stream = stream;
		this.salary = 30000;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "ElectricalTeacher [stream=" + stream + ", salary=" + salary + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getEmail()=" + getEmail() + ", getId()=" + getId() + "]";
	}
	
	
}
