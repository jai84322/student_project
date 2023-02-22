<p align="center">
  <h1 align="center">Student Management Project</h1>
</p>


## Table of contents

- [Getting started](#getting-started)
- [Requirements](#requirements)
- [Project Structure and Code Flow](#project-structure-and-code-flow)
- [Folder tree structure](#folder-tree-structure)
- [Approach](#approach)
- [features provided](#features-provided)
- [concepts used](#concepts-used)

## Getting started

Student Management project handles students record, teachers record, earnings and expenditures of college.

- A simple student data management platform with CRUD, searching and sorting. students can pay their fees and see fee related data. 
- Teachers CRUD, searching. 
- College is maintaining an account from which salaries of teachers are paid. 


## Requirements

A) There is one student model in this project and it has following attributes:
- Student Model is parents and It will have 3 childs like CivilStudent, MechanicalStudent, ElectricalStudent

{ 
  name: string,
  email: string,
  age: int,
  rollNo: int
}

- There is one student controller and it should have CRUD operations implemented. And students should be able to pay their fees. 

- For Admins, implementing Student sorting.

B) There is second model which is for Teachers.

C) There is Third model which is for College.


## Project Structure and Code Flow

- There is parent folder src inside that you will find 5 sub packages
1) com.student.entites
2) com.student.services
3) com.student.dao
4) com.student.controllers
5) com.student.helpers
 
 - The flow goes like = controllers+helpers -> services -> dao
 - dao layer will be using entities layer while creating new objects. 


## Folder tree structure


```text
       
 projectStudent/
    ├─ src/		 
    	├── main/
    	│  	├── controllers 
    	│	├── dao	
    	│	├── entities
    	│	├── helpers
    	│	└── services
    	└── test/
        	├── StudentServiceImplTest.java
        	 
        	
```


## Approach
A) Approach for students section: CRUD, searching, sorting, fees 
1) controllers 2) services  3) dao  4) entities


1) Entities: 
- Here I have created one student class and applied encapsulation concept on all data members in class.
- Post that I have written constructor method to initialize student object 
- Then I created following getters and setters method for all data members.
 

2) service Layer implementation : 
- Here I have written 4 operations a) create/insert 2) read/search 3) update 4) delete
- To store data I have used HashMap data structure

a) Create/insert: 
- Students can register themselves  

b) read/search: 
- Students can search themselves. 

c) update:
- Students can update their data

d) delete:
- Students can delete their data

e) payFees: 
- Students can pay their fees 


B) Approach for College section: paying salary to teachers, sorting of students

1) salary to teachers: Here we have a main account of college which is connected to students. So whenever any student pay their fees this main account will be credited. From this same main account we will be paying to teachers. So I have created data members to hold the values and have written the logic for the same idea.

2) Sorting of students: we have implemented custom sorting using comparator interface. A new comparator object is passed as argument while sorting. 


## Features provided
- Student CRUD: Here I created student entity and inherited specific stream entities like civil, electrical which is then used to create specific stream students. Post that comes service layer where a student interface is created and all the methods without bodies are written. Implementation is written in another file. For storing data we have used map data structure where keys are something unique for ex student rollNo or teacher id and their objects is stored as values.  

- Student sorting: Here I have sorted objects that are stored as values in hashmap using comparator.

- Students can pay their fees and can see their remaining fees also

- College can pay salaries to their teachers



## Concepts used

- Encapsulation: while creating student entity I have declared data members of the class as private and created getters and setters method to access or change the values.
- Abstraction: In service layer all the methods are declared without bodies using interface. This enabled us to hide the implementation.
- Inheritance: Student is the parent class and it has three childs CivilStudent, MechanicalStudent, ElectricalStudent. By using this concept I used the features available in parent class through child class.
- Polymorphism: It is used in service layer implementation where I Override all the methods.
- Comparator: The main reason for using comparator is to provide custom sorting without having to change the source code again and again. it is implemented in studentController
- HashMap: I have used this data structure because it provides constant search insertion deletion Time Complexity.
- java project structure  
- Exception handling
- unit testing 

 


