
package com.pkg;

class LibraryBook {
	private String title;
	private String author;
	private boolean isAvailable;

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

	void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book has been borrowed.");
		} else {
			System.out.println("Book is already borrowed.");
		}
	}

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
		LibraryBook b1 = new LibraryBook();
		b1.setTitle("Harry Potter");
		b1.setAuthor("ABC");
		b1.setAvailable(true);

		System.out.println("Book: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Available: " + b1.isAvailable());

		if (b1.isAvailable()) {
			b1.borrowBook();
		} else {
			b1.returnBook();
		}

		b1.borrowBook();
		b1.returnBook();
	}
}
