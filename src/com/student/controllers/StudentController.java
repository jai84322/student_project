package com.student.controllers;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

import com.student.helpers.*;

import com.student.services.StudentService;
import com.student.services.StudentServiceImpl;


public class StudentController {

	public static void main(String[] args) {
		
		try {
    	int choice;
    	StudentService stsr = new StudentServiceImpl();
    	
    	do {
    		Scanner sc1 = new Scanner(System.in); 
    		System.out.println("1.Add new student");
    		System.out.println("2.search student data");
    		System.out.println("3.update student");
    		System.out.println("4.delete student");
    		System.out.println("5.pay student fees");
    		System.out.println("0.exit the system");
    		System.out.print("enter your choice: ");
    		choice = sc1.nextInt(); 
    		sc1.nextLine();	
    		if ( choice >  5 || choice < 0) {
    			throw new Exception("please enter number between 0 to 4");
    		}   
    		
    		switch (choice) {
			case 1: 
				System.out.print("enter name of student: ");
				String name = sc1.nextLine();
				if (CommonHelper.checkValidString(name)) {
					throw new NullPointerException("please provide valid name input");
				};
				
				System.out.print("enter student stream: ");
				String stream = sc1.nextLine();
				
				if (CommonHelper.checkValidString(stream)) {
					throw new NullPointerException("please provide valid input");
				}
				
				System.out.print("enter age: ");
				int age = sc1.nextInt();
				sc1.nextLine();
				System.out.print("enter student email: ");
				String email = sc1.nextLine();
				if (CommonHelper.checkValidString(email)) {
					throw new NullPointerException("please provide valid email input");
				}
				
				System.out.print("enter student roll no: ");
				int rollno = sc1.nextInt();
				
				
				String str = stsr.add(name, age, email, rollno, stream);
				System.out.println("---------------------------------");
				System.out.println(str);	
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.print("enter your rollNo: ");
				rollno = sc1.nextInt();
				Object o = stsr.get(rollno);
				System.out.println("----------------------------------");
				System.out.println(o);
				System.out.println("----------------------------------");
				break;
				
			case 3:
				int choiceTwo;
				System.out.print("enter your rollno: ");
				rollno = sc1.nextInt();
				do {
					System.out.println("1.name");
					System.out.println("2.age");
					System.out.println("3.email");
					System.out.println("0.back to previous menu");
					System.out.print("enter your choice: ");
					choiceTwo = sc1.nextInt();
					
					switch (choiceTwo) {
					case 1: 
						System.out.println("enter your rollNo");
						rollno = sc1.nextInt();
						System.out.print("enter new name: ");
						name = sc1.nextLine();
						
						String updatedName = stsr.updateName(rollno, name);
						System.out.println("---------------------------------");
						System.out.println("your name has been updated to: " + updatedName );	
						System.out.println("---------------------------------");
						break;
					case 2:
						System.out.println("enter your rollNo");
						rollno = sc1.nextInt();
						System.out.print("enter new age: ");
						age = sc1.nextInt();
						
						int updatedAge = stsr.updateAge(rollno, age);
						System.out.println("---------------------------------");
						System.out.println("your age has been updated to: " + updatedAge);	
						System.out.println("---------------------------------");
						break;
					case 3:
						System.out.println("enter your rollNo");
						rollno = sc1.nextInt();
						System.out.print("enter the email: ");
						email = sc1.nextLine();
						
						String updatedEmail = stsr.updateEmail(rollno, email);
						System.out.println("-----------------------");
						System.out.println("your email has been updated to: " + updatedEmail);	
						System.out.println("-----------------------");
						break;
					}
				} 
				while (choiceTwo != 0 );
			
			case 4:
				System.out.print("enter your rollNo: ");
				rollno = sc1.nextInt();
				
				str = stsr.delete(rollno);
				System.out.println("-----------------------");
				System.out.println(str);	
				System.out.println("-----------------------");
				
			case 5:
				System.out.print("enter your rollNo: ");
				rollno = sc1.nextInt();
				sc1.nextLine();
				System.out.print("enter your stream: ");
				stream = sc1.nextLine();
				System.out.print("enter money you are paying: ");
				int money = sc1.nextInt();
				sc1.close();
				
				str = stsr.payFees(rollno, stream, money);
				System.out.println("------------------------------");
				System.out.println(str);
				System.out.println("------------------------------");
				break;
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
