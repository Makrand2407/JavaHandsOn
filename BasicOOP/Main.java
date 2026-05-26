package com.pkg;
// Student class represents a blueprint for student objects
class Student {
	String name;
	int age;
	char grade;
	
      // Constructor to initialize student details
	public Student(String name, int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

   // Method to display student details
	void displayDetails() {
		System.out.println("Name : " + name + " Age : " + age + " Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		//Creating Student Object
		Student s1 = new Student("Adam", 24, 'A');
		Student s2 = new Student("Jack", 42, 'B');
		Student s3 = new Student("Richard", 34, 'C');

		// Displaying details of each student
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
}
