package com.library;

public class Book {
	
	
	private int bookId;
	private String bookTitle;
	private int ammount;
	private int available;
	
	public Book() {
		this.bookId = 0;
		this.bookTitle = "Default";
		this.ammount = 0;
		this.available = 0;
	}
	
	public Book(int bookId, String bookTitle, int ammount, int available) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.ammount = ammount;
		this.available = available;
	};
	
	//Method show book info
	public void showBookInfo() {
		System.out.println(" === Book Info ===");
		System.out.println("Book ID: " + this.bookId);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Total ammount " + this.ammount);
		System.out.println("Available: " + this.available);
	}
	
	public int getBookId() {
		return bookId;
	}
	public int getAmmount() {
		return ammount;
	}
	public int getAvailable() {
		return available;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
}
