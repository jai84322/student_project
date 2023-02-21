package com.student.helpers;

public class CommonHelper {
	
	public static Boolean checkValidString(String name) {
		
		if (name.equals("null")) {
			return true;
		};
		return false;
	}
}
