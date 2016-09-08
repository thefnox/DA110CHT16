package exercise2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task4 extends Task {
	public Task4(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our bank!");
		System.out.print("Please enter your name: ");
		String name = scan.nextLine();
		String civicNumber ="";
		System.out.print("Please enter your civic number: ");
		try{
			//I don't recommend that you do this part the way I did it, this is just the fastest way.
			//If you do want to understand what the hell this is
			//Look up what a Pattern in Java is.
			civicNumber = scan.next("(\\d{6})|(\\d{6}-\\d{4})|(\\d{12})");
		}
		catch (NoSuchElementException ex){
			System.out.println("Invalid format for civic number");
			return;
		}
		System.out.print("Please enter how much money you have (SEK): ");
		double amount = scan.nextDouble();
		System.out.print("Please enter the interest rate in percent: ");
		int interest = scan.nextInt();
		double result = (double) amount * ((double) interest / 100.0) + amount;
		System.out.format("\nYour information:\nName : %s\nCivic number = %s\nBalance : %.2f\nInterest rate : %d%%\n\nAfter one year you will have %.2f SEK\n", name, civicNumber, amount, interest, result);
	}
}
