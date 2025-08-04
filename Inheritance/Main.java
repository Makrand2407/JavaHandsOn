package com.pkg;

class Appliance {
	String brand;
	String type;
	double price;
	boolean garranty;

	void showDetails() {
		System.out.println("Brand :" + brand);
		System.out.println("Type :" + type);
		System.out.println("Price :" + price);
		System.out.println("Garranty :" + garranty);
	}

	public Appliance(String brand, String type, double price, boolean garranty) {
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.garranty = garranty;
	}
}

class WashingMachine extends Appliance {
	double loadCapacity;

	void showDetails() {
		super.showDetails();
		System.out.println("Load capacity :" + loadCapacity + "kg");
	}

	public WashingMachine(String brand, String type, double price, boolean garranty, double loadCapacity) {
		super(brand, type, price, garranty);
		this.loadCapacity = loadCapacity;
	}
}

class SmartWashingMachine extends WashingMachine {
	boolean wifi;

	void showDetails() {
		super.showDetails();
		System.out.println("Wifi enabled :" + wifi);
	}

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
