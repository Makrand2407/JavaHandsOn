
package com.pkg;

class Print {
	void calculateSum(int... numbers) {
		int sum = 0;
		for (int s : numbers) {
			sum += s;
		}
		System.out.println("Sum : " + sum);
	}

	void calculateSum(double d, int... numbers) {
		System.out.println(d);
		int sum = 0;
		for (int s : numbers) {
			sum += s;
		}
		System.out.println("Sum : " + sum);
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.calculateSum(1, 2, 3, 4);
		p.calculateSum(2.4, 4, 6, 8);
	}
}
