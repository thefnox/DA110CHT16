package exercise5;

import java.util.Scanner;

public class Task6 extends Task {

	public Task6(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		int[] history = new int[10];
		System.out.print("Enter starting balance: ");
		int balance = scan.nextInt();
		int transactionCount = 0;
		int amount;
		while (true){
			amount = 0;
			do{
				System.out.print("Enter amount to withdraw or deposit, enter a negative number for withdrawals: ");
				amount = scan.nextInt();
				if (amount == 0) System.out.println("Amount must be non-zero.");
			}
			while (amount == 0);
			int aux = amount;
			int aux2;
			for (int i = 0; i < history.length; i++){
				aux2 = history[i];
				history[i] = aux;
				aux = aux2;
			}
			balance += amount;
			System.out.print("Would you like to continue?: ");
			String s = scan.next();
			if (s.toLowerCase().equals("no")) break;
		}
		System.out.println("History of transactions is as follows: ");
		for (int i = 0; i < history.length; i++){
			amount = history[i];
			if (amount > 0){
				System.out.printf("%d. Deposit of %d SEK\n", i + 1, amount);
			}
			else if (amount < 0){
				System.out.printf("%d. Withdrawal of %d SEK\n", i + 1, Math.abs(amount));
			}
			else{
				break;
			}
		}
		System.out.println("Current balance is " + balance + " SEK.");
	}

	
}
