package com.pkg;

abstract class Payment {
	abstract void processPayment(double price);
}

class CreditCardPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via Credit Card");
	}
}

class PayPalPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via PayPal");
	}
}

class BankTransferPayment extends Payment {
	@Override
	void processPayment(double price) {
		System.out.println("Processing ₹" + price + " via Bank Transfer");
	}
}

public class Main {
	public static void main(String[] args) {
		Payment p;

		p = new CreditCardPayment();
		p.processPayment(10000.0);

		p = new PayPalPayment();
		p.processPayment(5000.0);

		p = new BankTransferPayment();
		p.processPayment(2000.0);
	}
}
