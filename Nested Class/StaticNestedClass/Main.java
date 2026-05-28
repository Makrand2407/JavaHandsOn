
package com.pkg;

//Outer class 
public class Outer {
	static int outer = 20; // static field in Outer class
  
  //Inner class
	static class Inner{
		int y = 10;  //Field in Inner class
    
    // Method to display values from both Outer and Inner
		void display() {
			System.out.println("Outer = "+outer);
			System.out.println("y = "+y);

		}
	}

	public static void main(String[] args) {
		Outer.Inner o = new Outer.Inner(); //Instance of Inner class directly using Outer.Inner
		o.display();
		

	}

}
