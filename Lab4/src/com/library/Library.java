package com.library;
import java.util.*;

public class Library {
	private String libraryTitle;
	private static int nbBooks;
	private Book[] books;
	public static final int MAX_NUMBER_BOOKS = 100;
	
	public Library(String libraryTitle) {
		this.libraryTitle = libraryTitle;
		this.books = new Book[MAX_NUMBER_BOOKS];
		nbBooks = 0;
	}

	public String getLibraryTitle() {
		return libraryTitle;
	}
	public static int getNbBooks() {
		return nbBooks;
	}
	
	public void setLibraryTitle(String libraryTitle) {
		this.libraryTitle = libraryTitle;
	}
	
	public static void setNbBooks(int nbBooks) {
		Library.nbBooks = nbBooks;
	}
	
	public void addNewBook() {
		if (nbBooks >= MAX_NUMBER_BOOKS) {
			System.out.println("The number of books exceeded the limit 1");
			return;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter book's information");
		System.out.println("Book ID: ");
		int newBookId = input.nextInt();
		input.nextLine();
		System.out.println("Book title: ");
		String newBookTitle = input.nextLine();
		
		System.out.println("Ammount ");
		int newBookNums = input.nextInt();
		input.nextLine();
		
		if (MAX_NUMBER_BOOKS - nbBooks < newBookNums) {
			System.out.println("The number of books exceeded the limit 2");
			input.close();
			return;
		} 
		Book newBook = new Book(newBookId, newBookTitle, newBookNums, newBookNums);
		this.books[nbBooks] = newBook;
		nbBooks++;
//		input.close();
		System.out.println("Added book successfully");
		return;
	}
	
	public boolean findBook(int bookId) {		
		for (int i = 0; i < nbBooks; i++) {
			if (books[i].getBookId() == bookId) {
				books[i].showBookInfo();
				return true;
			}
		}
		return false;
	}
	
	public void borrowBook(int bookID) {
		for (int i = 0; i < nbBooks; i++) {
			if (books[i].getBookId() == bookID && books[i].getAvailable() > 0) {
				books[i].setAvailable(books[i].getAvailable() - 1);
				System.out.println("The book is borrowed successfully!");
				books[i].showBookInfo();
				return;
			}
		}
		System.out.println("Couldn't find book with id " + bookID);
		return;
	}
	public void returnBook(int bookID) {
		for (int i = 0; i < nbBooks; i++) {
			if (books[i].getBookId() == bookID && books[i].getAmmount() > books[i].getAvailable()) {
				books[i].setAvailable(books[i].getAvailable() + 1);
				System.out.println("The book is returned successfully!");
				books[i].showBookInfo();
				return;
			}
		}
		System.out.println("Couldn't find book with id " + bookID);
		return;
	}
	public void showLibraryInfo() {
		System.out.println("=== Library Info ===");
		System.out.println("Library Title: " + this.libraryTitle);
		System.out.println("Number of books: " + nbBooks);
		for (int i = 0; i < nbBooks; i++) {
			int count = i + 1;
			System.out.println("The book " + count + " is: " + books[i].getBookTitle() + " with " + books[i].getAvailable() + " left!");
		}
		System.out.println("Maximum number of books is " + MAX_NUMBER_BOOKS);
	}
}
