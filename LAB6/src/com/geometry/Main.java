package com.geometry;

public class Main {

	public static void main(String[] args) {
		// Test 
		MyPoint A = new MyPoint(2, 2);
		MyPoint B = new MyPoint(5, 2);
		MyPoint C = new MyPoint(1, 2);
		MyTriangle abc = new MyTriangle(A, B, C);
		
		//toString
		System.out.println(abc.toString());
		//get circumrence
		System.out.println(abc.getPerimeter());
		//get type
		System.out.println(abc.getType());
	}

}
