package com.utils;
import java.util.*;

public class MyDate {
	private int date;
	private int month;
	private int year;
	
	public Boolean setDate() {
		Scanner scan = new Scanner(System.in);
		date = scan.nextInt();
		if (date > 0 && date < 31) return true;
		return false;
	}
	public int getDate() {
		System.out.println("Date" + date);
		return date;
	}
}
