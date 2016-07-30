package hw1;

public class bank {
	//private is a visibility modifier
	private String name;
	private double balance;
	private long acctnumber;
	
	public void withdraw(double amt) {
		balance = balance - amt;
	}
	public double getBalance() {
		return balance;
	}
	public bank(String n, long number) {
		name = n;
		acctnumber = number;
		balance = 0;
	}
}
