package exercise2;

import java.util.Scanner;

public class Task1 extends Task{
	public Task1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scan.nextLine();
		System.out.println("Enter the amount of money that person has: ");
		double amount = scan.nextDouble();
		System.out.println("Enter the interest rate: ");
		int interest = scan.nextInt();
		System.out.println("Println: Information is: Name=" + name + ", Amount=" + amount + ", Interest=" + interest);
		System.out.format("Format: Information is: Name=%s, Amount=%.2f%n, Interest=%d\n", name, amount, interest);
		System.out.printf("Format: Information is: Name=%s, Amount=%.2f%n, Interest=%d\n", name, amount, interest);
	}
}
