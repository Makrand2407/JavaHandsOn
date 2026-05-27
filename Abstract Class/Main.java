package com.pkg;
// Abstract class representing a generic Payment
abstract class Payment {
	//abstract method to be implemented by subclasses
	abstract void processPayment(double price);
}

// Subclass for Credit Card payments
class CreditCardPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via Credit Card");
	}
}

// Subclass for Pay Pal payments
class PayPalPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via PayPal");
	}
}

// Subclass for Bank Transfer payments
class BankTransferPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via Bank Transfer");
	}
}

public class Main {
	public static void main(String[] args) {
		Payment p;//Payment reference

		// Using CreditCardPayment implementation
		p = new CreditCardPayment();
		p.processPayment(10000.0);
		// Using PayPalPayment implementation
		p = new PayPalPayment();
		p.processPayment(5000.0);
		// Using BankTransfer implementation
		p = new BankTransferPayment();
		p.processPayment(2000.0);
	}
}
