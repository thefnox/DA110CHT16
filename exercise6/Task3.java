package exercise6;

import java.util.Scanner;

public class Task3 extends Task {
	
	public static int accountCount = 0;
	
	Account account;

	public Task3() {
		// TODO Auto-generated constructor stub
	}

	public Task3(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public Account createAccount(){
		Account account = new Account();
		System.out.print("Enter your name: ");
		account.setName(scan.nextLine());
		System.out.print("Enter your address: ");
		account.setAddress(scan.nextLine());
		System.out.print("Enter your SSN: ");
		account.setAddress(scan.nextLine());
		System.out.print("Enter your phone number: ");
		account.setPhoneNumber(scan.nextInt());
		account.setAccountNumber(++accountCount);
		return account;
	}
	
	public void execute(){
		Account account = createAccount();
		while(true){
			System.out.print("Welcome to da bank!\n\n\t1. Withdrawals\n\t2. Deposits\n\t3. Account information\n\t4. Exit\n\nEnter your selection:");
			switch(scan.nextInt()){
				case 1:
					System.out.print("Enter amount to withdraw: ");
					account.withdraw(scan.nextInt());
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					account.deposit(scan.nextInt());
				case 3:
					System.out.println(account);
				case 4:
					System.out.println("Bye!");
					return;
				default:
					System.out.println("Invalid selection");
			}
		}
	}

}
