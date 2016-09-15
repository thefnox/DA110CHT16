package exercise3;

import java.util.Scanner;

public class Task4 extends Task {
	private class Account{
		public String name = "Test";
		public int balance = 0;
	}
	
	public Task4(){
		int choice, x;
		String s;
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("- - - - Welcome to Bank of Hkr - - - -\n1) New account\n2) View account\n3) Deposit\n4) Withdraw\n5) Exit\n- - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.print("Enter your selection: ");
			choice = scan.nextInt();
			switch(choice){
				case 1:
					scan.nextLine();
					System.out.print("Enter the name of your new account: ");
					s = scan.nextLine();
					account = new Account();
					account.name = s;
					break;
				case 2:
					System.out.printf("Account information:\n\tName: %s\n\tBalance: %d\n", account.name, account.balance );
					break;
				case 3:
					System.out.print("Enter amount to deposit: ");
					x = scan.nextInt();
					if (x < 1) System.out.println("Invalid amount.");
					else{
						account.balance += x;
						System.out.println("Balance is now: " + account.balance);
					}
					break;
				case 4:
					System.out.print("Enter amount to withdraw: ");
					x = scan.nextInt();
					if (x > account.balance) System.out.println("Invalid amount.");
					else{
						account.balance -= x;
						System.out.println("Balance is now: " + account.balance);
					}
					break;
				case 5:
					System.out.println("Thanks for using Bank of Hkr...");
					return;
				default:
					System.out.println("Invalid selection");
					break;
			}
		}
	}
}
