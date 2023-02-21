package com.student.controllers;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.student.helpers.CommonHelper;
import com.student.services.*;

public class TeacherController {
		public static void main(String[] args) {
			
			
			try {
	    	int choice;
	    	TeacherService stsr = new TeacherServiceImpl();
	    	
	    	do {
	    		Scanner sc1 = new Scanner(System.in); 
	    		System.out.println("1.Add new Teacher");
	    		System.out.println("2.search Teacher data");
//	    		System.out.println("3.update student");
	    		System.out.println("4.delete Teacher");
	    		System.out.println("5.pay Teacher salary");
	    		System.out.println("0.exit the system");
	    		System.out.print("enter your choice: ");
	    		choice = sc1.nextInt(); 
	    		sc1.nextLine();	
	    		
	    		if ( choice >  4) {
	    			throw new Exception("please enter number between 0 to 4");
	    		}   
	    		
	    		
	    		switch (choice) {
				case 1: 
					System.out.print("enter name of teacher: ");
					String name = sc1.nextLine();
					if (CommonHelper.checkValidString(name)) {
						throw new NullPointerException("please provide valid name input");
					};
				
					
					
					System.out.print("enter teacher stream: ");
					String stream = sc1.nextLine();
					if (CommonHelper.checkValidString(stream)) {
						throw new NullPointerException("please provide valid stream input");
					}
					
					System.out.print("enter teacher age: ");
					int age = sc1.nextInt();
					sc1.nextLine();
					System.out.print("enter teacher email: ");
					String email = sc1.nextLine();
					if (CommonHelper.checkValidString(email)) {
						throw new NullPointerException("please provide valid email input");
					}
					
					System.out.print("enter Teacher id: ");
					int id = sc1.nextInt();
					
					
					String str = stsr.add(name, age, email, id, stream);
					System.out.println("---------------------------------");
					System.out.println(str);	
					System.out.println("---------------------------------");
					break;
				case 2:
					System.out.print("enter teacher id: ");
					id = sc1.nextInt();
					Object o = stsr.get(id);
					System.out.println("----------------------------------");
					System.out.println(o);
					System.out.println("----------------------------------");
					break;
					
//				case 3:
//					int choiceTwo;
//					System.out.print("enter your rollno: ");
//					rollno = sc1.nextInt();
//					do {
//						System.out.println("1.name");
//						System.out.println("2.age");
//						System.out.println("3.email");
//						System.out.println("0.back to previous menu");
//						System.out.print("enter your choice: ");
//						choiceTwo = sc1.nextInt();
//						
//						switch (choiceTwo) {
//						case 1: 
//							System.out.println("enter your rollNo");
//							rollno = sc1.nextInt();
//							System.out.print("enter new name: ");
//							name = sc1.nextLine();
//							
//							String updatedName = stsr.updateName(rollno, name);
//							System.out.println("---------------------------------");
//							System.out.println("your name has been updated to: " + updatedName );	
//							System.out.println("---------------------------------");
//							break;
//						case 2:
//							System.out.println("enter your rollNo");
//							rollno = sc1.nextInt();
//							System.out.print("enter new age: ");
//							age = sc1.nextInt();
//							
//							int updatedAge = stsr.updateAge(rollno, age);
//							System.out.println("---------------------------------");
//							System.out.println("your age has been updated to: " + updatedAge);	
//							System.out.println("---------------------------------");
//							break;
//						case 3:
//							System.out.println("enter your rollNo");
//							rollno = sc1.nextInt();
//							System.out.print("enter the email: ");
//							email = sc1.nextLine();
//							
//							String updatedEmail = stsr.updateEmail(rollno, email);
//							System.out.println("-----------------------");
//							System.out.println("your email has been updated to: " + updatedEmail);	
//							System.out.println("-----------------------");
//							break;
//						}
//					} 
//					while (choiceTwo != 0 );
				
				case 4:
					System.out.print("enter your rollNo: ");
					id = sc1.nextInt();
					
					str = stsr.delete(id);
					System.out.println("-----------------------");
					System.out.println(str);	
					System.out.println("-----------------------");
					
	    		}
	    	}
	    	while(choice != 0);

			 } catch (InputMismatchException ix) {
				System.out.println(ix + " error: please enter number only" );
			}  catch (NullPointerException nx) {
				System.out.println(nx+ " null is not allowed here");
			}
			catch (Exception e) {
	 			System.out.println(e);
				}

			
			
		}
}
