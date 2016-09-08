package exercise2;

import java.util.Scanner;

public class Task2 extends Task {
	public Task2(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scan.nextLine();
		System.out.println("Enter the amount of money that person has: ");
		double amount = scan.nextDouble();
		System.out.println("Enter the interest rate: ");
		int interest = scan.nextInt();
		double result = (double) amount * ((double) interest / 100.0) + amount;
		System.out.format("Information is: Name=%s, Amount=%.2f%n, Interest=%d, Amount after interest=%.2f%n\n", name, amount, interest, result);
	}
}
