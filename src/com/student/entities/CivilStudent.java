package com.student.entities;


public class CivilStudent extends Student{
	

	private String Stream;
	private int fees;
	private int paidFees; 
	
	public CivilStudent(String name, int age, String email, int rollNo, String stream ) {
	super(name,age,email,rollNo);
	this.Stream = stream;
	this.fees = 90000;
}
	
	public int getFees() {
		return fees;
	};
	
	public int getPaidFees() {
		return paidFees;
	}
	
	public void setPaidFees(int money) {
		paidFees = money;
	}
	
	public int getRemainingFees() {
		return fees - paidFees;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Civil [fees=" + getFees() + ", Stream=" + Stream + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getEmail()=" + getEmail() + ", getRollNo()=" + getRollNo() + "]";
	}
	
}
