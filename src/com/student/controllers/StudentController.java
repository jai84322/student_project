package com.student.controllers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import com.student.helpers.*;
import com.student.services.CollegeService;
import com.student.services.CollegeServiceImpl;
import com.student.services.StudentService;
import com.student.services.StudentServiceImpl;
import com.student.services.TeacherService;
import com.student.services.TeacherServiceImpl;


public class StudentController {

	public static void main(String[] args) {
		
		int choice;
		StudentService stsr = new StudentServiceImpl();
		CollegeService cgs = new CollegeServiceImpl();
		TeacherService tsr = new TeacherServiceImpl();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {    	
    	do {
    		System.out.println("1.Add new student");
    		System.out.println("2.search student data");
    		System.out.println("3.update student");
    		System.out.println("4.delete student");
    		System.out.println("5.pay student fees");
//    		System.out.println("6.Add new Teacher");
//    		System.out.println("7.pay teacher salary");
//    		System.out.println("8.get sorted students by Names");
//    		System.out.println("9.get sorted students by Age");
//    		System.out.println("10.get sorted students by Roll No");
    		System.out.println("0.exit the system");
    		System.out.print("enter your choice: ");
    		choice = Integer.parseInt(br.readLine()); 
    		if ( choice >  11 || choice < 0) {
    			throw new Exception("please enter number between 0 to 4");
    		}   
    		
    		switch (choice) {
			case 1: 
				System.out.print("enter name of student: ");
				String name = br.readLine();
				if (CommonHelper.checkValidString(name)) {
					throw new Exception("please provide valid name input");
				};
				
				System.out.print("enter student stream: ");
				String stream = br.readLine();
				if (CommonHelper.checkValidString(stream)) {
					throw new Exception("please provide valid stream input");
				}
				
				System.out.print("enter age: ");
				int age = Integer.parseInt(br.readLine());
				
				System.out.print("enter student email: ");
				String email = br.readLine();
				if (CommonHelper.checkValidString(email)) {
					throw new Exception("please provide valid email input");
				}
				
				System.out.print("enter student roll no: ");
				int rollno = Integer.parseInt(br.readLine()); 
				
				
				String str = stsr.add(name, age, email, rollno, stream);
				System.out.println("---------------------------------");
				System.out.println(str);	
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.print("enter your rollNo: ");
				rollno = Integer.parseInt(br.readLine());
				Object o = stsr.get(rollno);
				System.out.println("----------------------------------");
				if (o == null) {
					System.out.println("no such roll number found");
				} else {
					System.out.println(o);
				}
				System.out.println("----------------------------------");
				break;
				
			case 3:
				int choiceTwo;
				System.out.print("enter your rollno: ");
				rollno = Integer.parseInt(br.readLine());
				do {
					System.out.println("1.name");
					System.out.println("2.age");
					System.out.println("3.email");
					System.out.println("0.back to previous menu");
					System.out.print("enter your choice: ");
					choiceTwo = Integer.parseInt(br.readLine());
					if (choiceTwo >3 || choiceTwo <0) {
						throw new Exception("please enter number between 0 to 3");
					}
					
					switch (choiceTwo) {
					case 1: 
						System.out.print("enter your rollNo: ");
						rollno = Integer.parseInt(br.readLine());
						System.out.print("enter new name: ");
						name = br.readLine();
						if (CommonHelper.checkValidString(name)) {
							throw new Exception("please provide valid name input");
						};
						
						String updatedName = stsr.updateName(rollno, name);
						System.out.println("---------------------------------");
						System.out.println("your name has been updated to: " + updatedName );	
						System.out.println("---------------------------------");
						break;
					case 2:
						System.out.print("enter your rollNo: ");
						rollno = Integer.parseInt(br.readLine());
						System.out.print("enter new age: ");
						age = Integer.parseInt(br.readLine());
						
						int updatedAge = stsr.updateAge(rollno, age);
						System.out.println("---------------------------------");
						System.out.println("your age has been updated to: " + updatedAge);	
						System.out.println("---------------------------------");
						break;
					case 3:
						System.out.print("enter your rollNo: ");
						rollno = Integer.parseInt(br.readLine());
						System.out.print("enter the email: ");
						email = br.readLine();
						if (CommonHelper.checkValidString(email)) {
							throw new Exception("please provide valid name input");
						};
						
						String updatedEmail = stsr.updateEmail(rollno, email);
						System.out.println("-----------------------");
						System.out.println("your email has been updated to: " + updatedEmail);	
						System.out.println("-----------------------");
						break;
					}
				} 
				while (choiceTwo != 0 );
				System.out.println("-------------------------------------");
			
			case 4:
				System.out.print("enter your rollNo: ");
				rollno = Integer.parseInt(br.readLine());
				
				str = stsr.delete(rollno);
				System.out.println("-----------------------");
				System.out.println(str);	
				System.out.println("-----------------------");
				
			case 5:
				System.out.print("enter your rollNo: ");
				rollno = Integer.parseInt(br.readLine());
				System.out.print("enter your stream: ");
				stream = br.readLine();
				System.out.print("enter money you are paying: ");
				int money = Integer.parseInt(br.readLine());
				
				str = stsr.payFees(rollno, stream, money);
				System.out.println("------------------------------");
				System.out.println(str);
				System.out.println("------------------------------");
				break;
				
//			case 6:
//				System.out.print("enter name of teacher: ");
//				name = br.readLine();
//				if (CommonHelper.checkValidString(name)) {
//					throw new Exception("please provide valid name input");
//				};
//				
//				System.out.print("enter teacher stream: ");
//				stream = br.readLine();
//				if (CommonHelper.checkValidString(stream)) {
//					throw new Exception("please provide valid stream input");
//				}
//				
//				System.out.print("enter teacher age: ");
//				age = Integer.parseInt(br.readLine());
//				
//				System.out.print("enter teacher email: ");
//				email = br.readLine();
//				if (CommonHelper.checkValidString(email)) {
//					throw new Exception("please provide valid email input");
//				}
//				
//				System.out.print("enter Teacher id: ");
//				int id = Integer.parseInt(br.readLine());
//				
//				str = tsr.add(name, age, email, id, stream);
//				System.out.println("---------------------------------");
//				System.out.println(str);	
//				System.out.println("---------------------------------");
//				break;
//				
//			case 7:
//				System.out.print("enter teacher id: ");
//				id = Integer.parseInt(br.readLine());
//				
//				System.out.print("enter teacher stream: ");
//				stream = br.readLine();
//				
//				str = cgs.paySalary(id, stream); // what if I enter wrong id here ?
//				System.out.println("----------------------------------");
//				System.out.println(str);
//				System.out.println("----------------------------------");
//				break;
//			case 8:
//				str = cgs.sortStudentUsingName();
//				System.out.println(str);
//				break;
//				
//			case 9: 
//				str = cgs.sortStudentUsingAge();
//				System.out.println(str);
//				break;
//				
//			case 10:
//				str = cgs.sortStudentUsingRollNo();
//				System.out.println(str);
//				break;

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

	
