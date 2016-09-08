package exercise2;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 extends Task{
	public Task3(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scan.nextLine();
		System.out.println("Enter the amount of money that person has: ");
		double amount = scan.nextDouble();
		System.out.println("Enter the interest rate: ");
		int interest = scan.nextInt();
		String civicNumber ="";
		System.out.println("Enter a civic number");
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
		double result = (double) amount * ((double) interest / 100.0) + amount;
		System.out.format("Information is: Name=%s, Amount=%.2f%n, Interest=%d, Amount after interest=%.2f%n, Civic Number=%s\n", name, amount, interest, result, civicNumber);
	}
}
