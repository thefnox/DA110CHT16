package exercise4;

import java.util.Scanner;

public class Task5 extends Task {
	
	
	public static int accountCount = 0;
	
	public static Account currentAccount;
	
	private class Account{
		String name;
		String address;
		int phoneNumber;
		int accountNumber;
		double balance;
		
		public Account(){
			accountCount++;
			accountNumber = accountCount;
			balance = 0;
		}
	}
	
	public Account createAccount(){
		if (scan.hasNextLine()) scan.nextLine();
		Account account = new Account();
		System.out.print("Enter your name: ");
		account.name = scan.nextLine();
		System.out.print("Enter your address: ");
		account.address = scan.nextLine();
		System.out.print("Enter your phone number: ");
		account.phoneNumber = scan.nextInt();
		return account;
	}
	
	public void showAccount(Account account){
		System.out.println("Account information:");
		System.out.printf("\tName: %s\n\tAddress: %s\n\tPhone number: %d\n\tAccount number: %d\n\tBalance: %.2f SEK\n", account.name, account.address, account.phoneNumber, account.accountNumber, account.balance);
	}
	
	public void withdraw(Account account){
		System.out.print("Enter amount to withdraw, 0 to cancel: ");
		double x = scan.nextDouble();
		if (x < 0 || x > account.balance){
			System.out.println("Invalid amount.");
		}
		else if (x == 0){
			return;
		}
		else{
			account.balance -= x;
			System.out.printf("Account balance is now %.2f SEK\n", account.balance);
		}
	}
	
	public void deposit(Account account){
		System.out.print("Enter amount to deposit, 0 to cancel: ");
		double x = scan.nextDouble();
		if (x < 0){
			System.out.println("Invalid amount.");
		}
		else if (x == 0){
			return;
		}
		else{
			account.balance += x;
			System.out.printf("Account balance is now %.2f SEK\n", account.balance);
		}
	}
	
	public void execute(){
		if (currentAccount == null){
			currentAccount = createAccount();
		}
		while(mainMenu());
	}
	
	public boolean mainMenu(){
		System.out.print("- - - - Welcome to Bank of Hkr - - - -\n\n1) New account\n2) View account\n3) Deposit\n4) Withdraw\n5) Exit\n\n- - - - - - - - - - - - - - - - - - - - - - - - - -\nEnter your selection: ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				currentAccount = createAccount();
				break;
			case 2:
				showAccount(currentAccount);
				break;
			case 3:
				deposit(currentAccount);
				break;
			case 4:
				withdraw(currentAccount);
				break;
			case 5:
				System.out.println("Bye");
				return false;
			default:
				break;
		}
		return true;
	}


	public Task5(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}

}
