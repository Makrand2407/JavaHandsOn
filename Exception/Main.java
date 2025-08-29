package com.pkg;

import java.io.IOException;

class InvalidLoginException extends Exception {
	public InvalidLoginException(String s) {
		super(s);
	}
}

public class Main {
	static void validLogin(String username, String password) throws InvalidLoginException {
		if (username.isEmpty() || password.isEmpty()) {
			throw new InvalidLoginException("Invalid Login");
		}
		System.out.println("Login succesfully");
	}

	public static void main(String[] args) {
		try {
			validLogin("username1", "pwd123");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
