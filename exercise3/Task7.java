package exercise3;

import java.util.Scanner;

public class Task7 extends Task {
	public Task7(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to reverse: ");
		int n = scan.nextInt();
		String s = "";
		while (n > 0){
			s += n % 10;
			n = n / 10;
		}
		System.out.println("The reversed number is " + s);
	}
}
