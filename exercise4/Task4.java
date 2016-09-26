package exercise4;

import java.util.Scanner;

public class Task4 extends Task {

	public Task4(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void createAccount(){
		System.out.println("You have selected the Create Account option");
	}
	
	public void showAccount(){
		System.out.println("You have selected the Show Account option");
	}
	
	public void withdraw(){
		System.out.println("You have selected the Withdraw option");
	}
	
	public void deposit(){
		System.out.println("You have selected the Deposit option");
	}
	
	public void execute(){
		while(mainMenu());
	}
	
	public boolean mainMenu(){
		System.out.print("- - - - Welcome to Bank of Hkr - - - -\n\n1) New account\n2) View account\n3) Deposit\n4) Withdraw\n5) Exit\n\n- - - - - - - - - - - - - - - - - - - - - - - - - -\nEnter your selection: ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				createAccount();
				break;
			case 2:
				showAccount();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("Bye");
				return false;
			default:
				break;
		}
		return true;
	}

}
