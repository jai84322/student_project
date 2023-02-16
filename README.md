# Student Management Project
- A simple student data management platform with CRUD, searching and sorting.

# Key points - Requirements
- There is one student model in this project and it has following attributes:
- Student Model 

{ 
  name: string,
  email: string,
  age: int,
  rollNo: int
}

- There is one student controller and it has CRUD operations implemented. 
1) New students can register themselves.
2) Existing students can search their own data.
3) Students can update their data.
4) Students can delete their data.

- For Admins, implementing sorting.



# Approach
- This project contains two packages 1) entities 2) controllers

1) Entities: 
- Here I have created one student class and applied encapsulation concept on all data members in class.
- Post that I have written constructor method to initialize student object 
- Then I created following getters and setters method for all data members.
 


2) Controllers: 
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

