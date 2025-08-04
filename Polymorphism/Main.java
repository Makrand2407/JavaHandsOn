package com.pkg;

class Animal {
	void makeSound() {
		System.out.println("Animals Sound");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat is meowing");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog is barking");
	}
}

class Cow extends Animal {
	void makeSound() {
		System.out.println("Cow is mooing");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.makeSound();
		a = new Dog();
		a.makeSound();
		a = new Cow();
		a.makeSound();
	}
}
