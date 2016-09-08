package exercise2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task5 extends Task {
	public Task5(){
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
		System.out.print("Enter the amount of money you would like to withdraw, enter 0 if none: ");
		double withdraw = scan.nextDouble();
		while (amount - withdraw < 0 || withdraw < 0){
			System.out.printf("Amount is invalid, must be less than %.2f, please enter a smaller amount: ", amount);
			withdraw = scan.nextDouble();
		}
		amount -= withdraw;
		System.out.print("Enter the amount of money you would like to deposit, enter 0 if none: ");
		double deposit = scan.nextDouble();
		while (deposit < 0){
			System.out.print("Deposit amount can't be negative, please enter an amount greater than 0 (Or 0 if none): ");
			deposit = scan.nextDouble();
		}
		amount += deposit;
		System.out.format("\nYour information:\nName : %s\nCivic number = %s\nBalance : %.2f\nInterest rate : %d%%\n\nAfter one year you will have %.2f SEK\n", name, civicNumber, amount, interest, result);
	}
}
