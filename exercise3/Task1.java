package exercise3;

import java.util.Scanner;

public class Task1 extends Task {
	public Task1(){
		Scanner scan = new Scanner(System.in);
		int balance = 1000;
		int withdrawal = 0;
		while (true){
			System.out.print("Enter amount to withdraw:");
			withdrawal = scan.nextInt();
			if ((withdrawal % 100) != 0 || withdrawal > balance){
				System.out.printf("Amount invalid, it must be divisible by 100 and less than %d SEK.\n", balance);
			}
			else{
				balance -= withdrawal;
				break;
			}
		}
		System.out.println("Balance is now " + balance + " SEK.");
	}
}
