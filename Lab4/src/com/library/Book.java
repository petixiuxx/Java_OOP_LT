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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ammount;
		result = prime * result + available;
		result = prime * result + bookId;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ammount != other.ammount)
			return false;
		if (available != other.available)
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		return true;
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
