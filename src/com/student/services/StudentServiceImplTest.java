package com.student.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentServiceImplTest {

	StudentService std;
	@BeforeEach
	void setUp() throws Exception {
		std = new StudentServiceImpl();
	}

	@Test
	void testAdd() {
		
		String str = std.add("jai", 22, "jai@gmail.com", 121, "civil");
		Assertions.assertEquals("student added successfully", str);
	}

	@Test // problem here
	void testGet() {
		Object o = std.get(121);
		System.out.println("o: "+o);
//		Assertions.assertEquals(, o);
	}

	@Test
	void testUpdateName() {
		String str = std.updateName(121, "rahul");
		Assertions.assertEquals("rahul", str);
	}

	@Test
	void testUpdateAge() {
		int num = std.updateAge(121, 24);
		Assertions.assertEquals(24, num);
	}

	@Test
	void testUpdateEmail() {
		String str = std.updateEmail(121, "rahul@gmail.com");
		Assertions.assertEquals("rahul@gmail.com", str);
	}

	@Test
	void testDelete() {
		String str = std.delete(121);
		Assertions.assertEquals("student deleted successfully", str);
	}

	@Test // problem here 
	void testPayFees() {
		String str2 = "total fees: " + "90000"  + " || fees paid: " + "10000" + " || remaining fees: " + "80000";
		String str = std.payFees(121, "civil", 10000);
		Assertions.assertEquals(str2, str);
	}

}
