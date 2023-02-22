package com.student.controllers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

import com.student.services.CollegeService;
import com.student.services.CollegeServiceImpl;

public class CollegeController {
	
public static void main(String[] args) {
		
		int choice;
		CollegeService cgs = new CollegeServiceImpl();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {    	
    	do {
    		System.out.println("1.pay teacher salary");
    		System.out.println("2.get sorted students by Names");
    		System.out.println("3.get sorted students by Roll no");
    		System.out.println("4.get sorted students by Age");
    		System.out.println("5.filter students by age");
    		System.out.println("0.exit the system");
    		System.out.print("enter your choice: ");
    		choice = Integer.parseInt(br.readLine()); 
    		if ( choice >  3 || choice < 0) {
    			throw new Exception("please enter number between 0 to 4");
    		}   
    		
    		switch (choice) {
			case 1: 
				System.out.print("enter teacher id: ");
				int id = Integer.parseInt(br.readLine());
				
				System.out.print("enter teacher stream: ");
				String stream = br.readLine();
				
				String str = cgs.paySalary(id, stream); // what if I enter wrong id here
				System.out.println("----------------------------------");
				System.out.println(str);
				System.out.println("----------------------------------");
				break;
				
			case 2:
				str = cgs.sortStudentUsingName();
				System.out.println(str);
				break;
		
			case 3:
				str = cgs.sortStudentUsingRollNo();
				System.out.println(str);
				break;
				
			case 4:
				str = cgs.sortStudentUsingRollNo();
				System.out.println(str);
				break;
				
			case 5:
				
				break;
    		}
    	}
    	while(choice != 0);
    	System.out.println("system exiting");
    
		 } catch(NumberFormatException num) {
			 System.out.println(num+" || error: please enter number only in the input");
		 } catch (InputMismatchException ix) {
			System.out.println(ix + " error: please enter number only" );
		} catch (NullPointerException nx) {
			System.out.println(nx+ " null is not allowed here");
		} catch (Exception e) {
 			System.out.println(e);
		} finally {
    		try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

}
