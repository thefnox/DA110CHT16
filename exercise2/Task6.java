package exercise2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task6 extends Task{
	private class BankAccount{
		String name = "";
		String civicNumber ="";
		double amount = 0.0;
		int interest = 0;
		double result = 0.0;
		double withdraw = 0.0;
		double deposit = 0.0;
	}
	public Task6(){
		int max = 2;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our bank!");
		BankAccount[] accounts = new BankAccount[max];
		while (i++ < max){
			System.out.println("Account #" + (i));
			accounts[i-1] = new BankAccount();
			BankAccount account = accounts[i - 1];
			System.out.print("Please enter your name: ");
			scan.nextLine();
			account.name = scan.nextLine();
			System.out.print("Please enter your civic number: ");
			try{
				//I don't recommend that you do this part the way I did it, this is just the fastest way.
				//If you do want to understand what the hell this is
				//Look up what a Pattern in Java is.
				account.civicNumber = scan.next("(\\d{6})|(\\d{6}-\\d{4})|(\\d{12})");
			}
			catch (NoSuchElementException ex){
				System.out.print("\nInvalid format for civic number");
				return;
			}
			System.out.print("Please enter how much money you have (SEK): ");
			account.amount = scan.nextDouble();
			System.out.print("Please enter the interest rate in percent: ");
			account.interest = scan.nextInt();
			account.result = (double) account.amount * ((double) account.interest / 100.0) + account.amount;
			System.out.print("Enter the amount of money you would like to withdraw, enter 0 if none: ");
			account.withdraw = scan.nextDouble();
			while (account.amount - account.withdraw < 0 || account.withdraw < 0){
				System.out.printf("Amount is invalid, must be less than %.2f, please enter a smaller amount: ", account.amount);
				account.withdraw = scan.nextDouble();
			}
			account.amount -= account.withdraw;
			System.out.print("Enter the amount of money you would like to deposit, enter 0 if none: ");
			account.deposit = scan.nextDouble();
			while (account.deposit < 0){
				System.out.print("Deposit amount can't be negative, please enter an amount greater than 0 (Or 0 if none): ");
				account.deposit = scan.nextDouble();
			}
			account.amount += account.deposit;
		}
		for (i=0; i<accounts.length; i++){
			BankAccount account = accounts[i];
			System.out.format("\nAccount #%d:\nName : %s\nCivic number = %s\nBalance : %.2f\nInterest rate : %d%%\n\nAfter one year you will have %.2f SEK\n", i + 1 ,account.name, account.civicNumber, account.amount, account.interest, account.result);
		}
	}
}
