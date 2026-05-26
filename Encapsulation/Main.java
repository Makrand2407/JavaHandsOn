
package com.pkg;
// Class representing a library book
class LibraryBook {
  // Private fields to enforce encapsulation
	private String title;
	private String author;
	private boolean isAvailable;
	
	 // Getter and setter for title,author and availability
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	// Method to borrow a book
	void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book has been borrowed.");
		} else {
			System.out.println("Book is already borrowed.");
		}
	}

	// Method to return a book
	void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book has been returned.");
		} else {
			System.out.println("Book was not borrowed.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		//create LibraryBook object
		LibraryBook b1 = new LibraryBook();
		b1.setTitle("Harry Potter");
		b1.setAuthor("ABC");
		b1.setAvailable(true);

		// Display book details
		System.out.println("Book: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Available: " + b1.isAvailable());

		// Borrow or return depending on availability
		if (b1.isAvailable()) {
			b1.borrowBook();
		} else {
			b1.returnBook();
		}

		b1.borrowBook();
		b1.returnBook();
	}
}
