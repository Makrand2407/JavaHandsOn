package com.pkg;

// Base class representing a generic appliance
class Appliance {
	String brand;
	String type;
	double price;
	boolean garranty;

	//Method to display appliance details
	void showDetails() {
		System.out.println("Brand :" + brand);
		System.out.println("Type :" + type);
		System.out.println("Price :" + price);
		System.out.println("Garranty :" + garranty);
	}

	// Constructor to initialize appliance details
	public Appliance(String brand, String type, double price, boolean garranty) {
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.garranty = garranty;
	}
}

// Derived class representing a Washing Machine
class WashingMachine extends Appliance {
	double loadCapacity;

	// Overriding showDetails to include load capacity
	void showDetails() {
		super.showDetails();// call parent method
		System.out.println("Load capacity :" + loadCapacity + "kg");
	}

	 // Constructor to initialize washing machine details
	public WashingMachine(String brand, String type, double price, boolean garranty, double loadCapacity) {
		super(brand, type, price, garranty);
		this.loadCapacity = loadCapacity;
	}
}

// Derived class representing a smart Washing Machine
class SmartWashingMachine extends WashingMachine {
	boolean wifi;

	// Overriding showDetails to include wifi feature
	void showDetails() {
		super.showDetails();// call parent method
		System.out.println("Wifi enabled :" + wifi);
	}

	 // Constructor to initialize smart washing machine details
	public SmartWashingMachine(String brand, String type, double price, boolean garranty, double loadCapacity,
			boolean wifi) {
		super(brand, type, price, garranty, loadCapacity);
		this.wifi = wifi;
	}
}

public class Main {
	public static void main(String[] args) {
		Appliance s1 = new SmartWashingMachine("AB", "Washing machine", 22076.00, true, 7.00, true);
		s1.showDetails();
	}
}
