package com.pkg;
// Outer class
public class Outer {
	String message = "Hello"; // field in Outer class
  // Inner class
	class Inner{
		int a = 10; // field in Inner class
    
    // Method to display values from both Inner and Outer
		void display() {
			System.out.println("a ="+a);
			System.out.println("Outer="+message);
		}
	
	}
	public static void main(String[] args) {
		Outer outer = new Outer();   // instance of Outer class
		Outer.Inner inner = outer.new Inner(); // instance of Inner class using Outer object
		inner.display();
	}
}
