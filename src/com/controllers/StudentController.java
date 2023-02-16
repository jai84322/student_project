package com.controllers;


import java.util.*;
import com.entities.*;


public class StudentController {
	
    public static void main(String[] args) {

    	Map<Integer, Student > map = new HashMap<>();
    	int choice;
    	
    	// figure this out
//    	sc1.nextInt // \n
//    	sc1.nextLine() // 
//    	sc1.nextline(); // 
//    	sc1.nextLine() // 
    	
    	do {
    		Scanner sc1 = new Scanner(System.in); 
    		Scanner sc2 = new Scanner(System.in);
    		System.out.println("1.Add new student");
    		System.out.println("2.search student data");
    		System.out.println("3.update student");
    		System.out.println("4.delete student");
    		System.out.println("0.exit the system");
    		System.out.print("enter your choice: ");
    		choice = sc1.nextInt(); 
    		
    		switch (choice) {
			case 1: 
				System.out.print("enter name of student: ");
				String sname = sc2.nextLine();
				System.out.print("enter student stream: ");
				String sstream = sc2.nextLine();
				System.out.print("enter age: ");
				int sage = sc1.nextInt();
				System.out.print("enter student email: ");
				String semail = sc2.nextLine();
				System.out.print("enter student roll no: ");
				int srollno = sc1.nextInt();

				if (sstream.equals("civil")) {
					map.put(srollno, new Civil(sname, sage, semail, srollno, sstream));
				} else if (sstream.equals("mechanical")) {
					map.put(srollno, new Mechanical(sname, sage, semail, srollno, sstream));
				} else if (sstream.equals("electrical")) {
					map.put(srollno, new Electrical(sname, sage, semail, srollno, sstream));
				}
				System.out.println(map);
				break;
			case 2:
				System.out.print("enter your rollNo: ");
				srollno = sc1.nextInt();
				Student std = map.get(srollno);
				System.out.println("-----------------------");
				System.out.println(std);
				System.out.println("-----------------------");
				break;
			case 3:
				int choiceTwo;
				System.out.print("enter your rollno: ");
				srollno = sc1.nextInt();
				do {
					System.out.println("1.name");
					System.out.println("2.age");
					System.out.println("3.email");
					System.out.println("4.rollNo");
					System.out.println("0.back to previous menu");
					System.out.print("enter your choice: ");
					choiceTwo = sc1.nextInt();
					
					switch (choiceTwo) {
					case 1: 
//						System.out.println("enter your rollNo");
//						srollno = sc1.nextInt();
						System.out.print("enter the name: ");
						sname = sc2.nextLine();
						std = map.get(srollno);
						std.setName(sname);
						System.out.println("-----------------------");
						System.out.println("your name has been updated to: " + std.getName());	
						System.out.println("-----------------------");
						break;
					case 2:
//						System.out.println("enter your rollNo");
//						srollno = sc1.nextInt();
						System.out.print("enter the age: ");
						sage = sc1.nextInt();
						std = map.get(srollno);
						std.setAge(sage);
						System.out.println("-----------------------");
						System.out.println("your age has been updated to: " + std.getAge());	
						System.out.println("-----------------------");
						break;
					case 3:
//						System.out.println("enter your rollNo");
//						srollno = sc1.nextInt();
						System.out.print("enter the email: ");
						semail = sc2.nextLine();
						std = map.get(srollno);
						std.setEmail(semail);
						System.out.println("-----------------------");
						System.out.println("your email has been updated to: " + std.getEmail());	
						System.out.println("-----------------------");
						break;
					case 4:
//						System.out.println("enter your rollNo");
//						srollno = sc1.nextInt();
						System.out.print("enter the rollNo: ");
						srollno = sc1.nextInt();
						std = map.get(srollno);
						std.setRollNo(srollno);
						System.out.println("-----------------------");
						System.out.println("your rollNo has been updated to: " + std.getRollNo());	
						System.out.println("-----------------------");
						break;
					}
					
				} while (choiceTwo != 0 );
			
			case 4:
				System.out.print("enter your rollNo: ");
				srollno = sc1.nextInt();
				map.remove(srollno);
				System.out.println("-----------------------");
				System.out.println("student deleted successfully");	
				System.out.println("-----------------------");
				System.out.println(map);
    		}
    	}
    	while(choice != 0);

    	System.out.println(map);
    	System.out.println(map.keySet());
    	System.out.println(map.values());
    	// comparable 
//    	Collections.sort(map.values());
    	
    	Set<Map.Entry<Integer, Student>> entrySet = map.entrySet();
    	List<Map.Entry<Integer, Student>> list = new ArrayList<>(entrySet);
    	
    	Collections.sort(list, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
    	
    	list.forEach(e->{
    		System.out.println(e.getKey() + "\t" + e.getValue());
    	});
    	
    	System.out.print(map);
    }
}

