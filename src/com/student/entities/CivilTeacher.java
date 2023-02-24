package com.student.entities;



public class CivilTeacher extends Teacher {
	
	private String stream;
	private int salary;
	private int paidAmount;
	
	public CivilTeacher( String name, int age, String email, int id, String stream) {
		
		super(name,age,email,id);
		this.stream = stream;
		this.salary = 50000;
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
	
	public int getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public String toString() {
		return "CivilTeacher [stream=" + stream + ", salary=" + salary + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getEmail()=" + getEmail() + ", getId()=" + getId() + "]";
	}

	
}
