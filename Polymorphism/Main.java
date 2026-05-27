package com.pkg;

// Base class representing a generic Animal
class Animal {
	// Method to make a generic animal sound
	void makeSound() {
		System.out.println("Animals Sound");
	}
}

// Subclass representing a Cat
class Cat extends Animal {
	// Overriding makeSound to provide Cat-specific behavior
	void makeSound() {
		System.out.println("Cat is meowing");
	}
}

// Subclass representing a Dog
class Dog extends Animal {
   // Overriding makeSound to provide Dog-specific behavior
	void makeSound() {
		System.out.println("Dog is barking");
	}
}

// Subclass representing a Cow
class Cow extends Animal {
  // Overriding makeSound to provide Cow-specific behavior
	void makeSound() {
		System.out.println("Cow is mooing");
	}
}

public class Main {
	public static void main(String[] args) {
		// Animal reference pointing to Cat object
		Animal a = new Cat();
		a.makeSound();
		// Animal reference pointing to Dog object
		a = new Dog();
		a.makeSound();
		// Animal reference pointing to Cow object
		a = new Cow();
		a.makeSound();
	}
}
