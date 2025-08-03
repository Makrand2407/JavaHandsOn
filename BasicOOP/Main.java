
package com.pkg;

class Student {
	String name;
	int age;
	char grade;

	public Student(String name, int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	void displayDetails() {
		System.out.println("Name : " + name + " Age : " + age + " Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Adam", 24, 'A');
		Student s2 = new Student("Jack", 42, 'B');
		Student s3 = new Student("Richard", 34, 'C');
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
}
