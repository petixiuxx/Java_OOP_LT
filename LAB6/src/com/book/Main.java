package com.book;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author Rowling = new Author("JK Rowling", "aha@example.com", 'M');
		Author Rowling2 = new Author("JK Rowling2", "aha@example.com", 'M');
		Author[] authors = { Rowling, Rowling2 };
		System.out.println(Rowling.toString());
		Book HP = new Book("Harry Potter", authors, 100.0);
		System.out.println(HP.toString());
		System.out.println(HP.getAuthorNames());
	}

}
