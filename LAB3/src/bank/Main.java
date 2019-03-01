package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Thanh = new Account("Thanh", 10);
		Thanh.display();
		Thanh.withDraw(100);
		Thanh.display();
	}

}
