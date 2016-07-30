package hw1;

import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter the amount due: ");
		int amountDue = reader.nextInt();
		System.out.println("Enter the amount you receive: ");
		int amountReceived = reader.nextInt();
		int change = amountReceived - amountDue;
		int dollars = change / 100;
		change = change - dollars * 100;
		int quarters = change / 25;
		change = change - quarters * 25;
		int dimes = change / 10;
		change = change - dimes * 10;
		int nickels = change / 5;
		change = change - nickels * 5;
		int pennies = change;
		String message = String.format("You should give %d dollars, %d quarters,"
				+                      " %d dimes, %d nickels, %d pennies",
									   dollars,quarters,dimes,nickels,pennies);
		System.out.println(message);
		reader.close();
	}

}
