package exercise3;

import java.util.Scanner;

public class Task2 extends Task {
	public Task2(){
		Scanner scan = new Scanner(System.in);
		String name;
		String address;
		String entry;
		String phoneNumber;
		while(true){
			System.out.print("Enter your name: ");
			name = scan.nextLine();
			System.out.printf("Is your name '%s' ?(yes/no): ", name);
			entry = scan.nextLine().toLowerCase();
			if (entry.equals("yes")){
				break;
			}
		}
		do{
			System.out.print("Enter your address: ");
			address = scan.nextLine();
			System.out.printf("Is your address '%s' ?(yes/no): ", address);
			entry = scan.nextLine().toLowerCase();
			if (entry.equals("yes")){
				break;
			}
		}
		while(true);
		while(true){
			System.out.print("Enter your phone number: ");
			phoneNumber = scan.nextLine();
			System.out.printf("Is your phone number '%s' ?(yes/no): ", phoneNumber);
			entry = scan.nextLine().toLowerCase();
			if (entry.equals("yes")){
				break;
			}
		}
	}
}
