
package com.entities;

public class Civil extends Student{
	

	private String Stream; 
	
	public Civil(String name, int age, String email, int rollNo, String stream ) {
	super(name,age,email,rollNo);
	this.Stream = stream;
}
	
	int getFees() {
		return 90000;
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
