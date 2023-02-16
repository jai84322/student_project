
package com.entities;

public class Electrical extends Student {

	private int fees = 70000;
	private String Stream; 
	
	public Electrical(String name, int age, String email, int rollNo, String stream ) {
	super(name,age,email,rollNo);
	this.Stream = stream;
}
	
	int getFees() {
		return fees;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Electrical [fees=" + fees + ", Stream=" + Stream + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getEmail()=" + getEmail() + ", getRollNo()=" + getRollNo() + "]";
	}
	
	
	
}

