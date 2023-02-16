
package com.entities;

public class Mechanical extends Student{
	
	private int fees = 80000;
	private String Stream; 
	
	public Mechanical(String name, int age, String email, int rollNo, String stream ) {
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
		return "Mechanical [fees=" + fees + ", Stream=" + Stream + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getEmail()=" + getEmail() + ", getRollNo()=" + getRollNo() + "]";
	}

}

