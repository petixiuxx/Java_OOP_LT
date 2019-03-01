package bank;

public class Account {
	String name;
	int balance;
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public void display() {
		System.out.println("Account name" + name);
		System.out.println("Balance " + balance);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Deposit processing method
	public void deposit(int money) {
		this.balance += money;
	}
	public Boolean withDraw(int money) {
		if (this.balance <= 0 || money  this.balance) return false;
		
		this.balance -= money;
		return true;
	}
	
}
