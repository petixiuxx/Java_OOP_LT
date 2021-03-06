package com.library;
import java.util.*;

public class Program {
	private static int option;
	static Scanner scan = new Scanner(System.in);
	public static int askOption() {
		int input = scan.nextInt();
		scan.nextLine();
		return input;
	}
	
	public static void showMenu() {
//		Scanner input = new Scanner(System.in);
		int id;
		Library newLib = new Library("New Library");
	
		do {
			System.out.println("=== Main menu ===");
			System.out.println("1. Show library information");
			System.out.println("2. Add new book");
			System.out.println("3. Find book");
			System.out.println("4. Borrow a book");
			System.out.println("5. Return a book");
			System.out.println("6. Exit");
			System.out.println("================");
			System.out.println("Enter menu ID (1-6)");
//			if (input.hasNext()) {
//				input.nextLine();
//			}
//			option = input.nextInt();
			if (scan.hasNext()) {
				option = askOption();
			}
			
			switch(option) {
			case 1:
				newLib.showLibraryInfo();
				break;
			case 2:
				newLib.addNewBook();
//				System.out.println("Added");
				break;
			case 3:
				System.out.println("Enter book id");				
				id = askOption();
				newLib.findBook(id);
//				System.out.println("found");
				break;
			case 4:
				System.out.println("Enter book id");				
				id = askOption();
				newLib.borrowBook(id);
//				System.out.println("borrowed");
				break;
			case 5:
				System.out.println("Enter book id");				
				id = askOption();
				newLib.returnBook(id);
			}
			
		} while (option != 6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		scan.close();
	}

}
