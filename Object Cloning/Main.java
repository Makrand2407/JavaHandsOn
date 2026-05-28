package com.pkg;

// Address class to represent employee's location details
class Address{
	String city;
	String state;
	String country;
  // Constructor to initialize address fields
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

// Employee class implementing Cloneable interface
class Employee implements Cloneable{
	int empid;
	String name;
	Address address;
  // Constructor to initialize employee details
	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}

  //Overriding clone() method to perform shallow copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
public class Main {

	public static void main(String[] args) {
		Address addr = new Address("Chennai","Tamilnadu","India");
		Employee e1 = new Employee(100,"Ram",addr); // Employee object with Address
    // Clone Employee object (shallow copy)
		Employee e2 = null;
		try {
			e2 = (Employee)e1.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(e1.address.city+" "+e2.address.city);//Chennai Chennai
		
		e2.address.city = "ABC";
		System.out.println(e1.address.city+" "+e2.address.city);//ABC ABC
	}

}
