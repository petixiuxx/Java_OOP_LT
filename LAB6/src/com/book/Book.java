package com.book;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	public Book(String name, Author[] authors, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public double getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Book[name=" + this.name + ",authors={";
		for (int i = 0; i < this.authors.length; i++) {
			result += this.authors[i].toString();
			if (i < this.authors.length - 1) {
				result += ',';
			}
		}
		result += "},price=" + this.price + ",qty=" + this.qty + "]";
		return result;
	}
	public String getAuthorNames() {
		String result = "";
		for (int i = 0; i < this.authors.length; i++) {
			result += this.authors[i].getName();
			if (i < this.authors.length - 1) {
				result += ',';
			}
		}
		return result;
	}
}
