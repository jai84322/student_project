package com.student.helpers;

public class CommonHelper {
	
	public static Boolean checkValidString(String name) {
		
		if (name.equals("null")) {
			return true;
		}
		
		try {
		int n = Integer.parseInt(name);
		if (n >=0 || n < 0) {
			return true;
		}
		} catch (NumberFormatException e) {
			return false;
		}
		
		if (name.trim().length() == 0) {
			return true;
		}
		return false;
	}
	

}
