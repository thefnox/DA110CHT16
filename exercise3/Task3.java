package exercise3;

import java.util.Scanner;

public class Task3 extends Task {
	
	private class Account{
		public String name = "Test";
		public int balance = 0;
	}
	
	public Task3(){
		int choice, x;
		String s;
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
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
				break;
			case 4:
				System.out.print("Enter amount to withdraw: ");
				x = scan.nextInt();
				
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
