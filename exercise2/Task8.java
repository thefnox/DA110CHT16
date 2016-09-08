package exercise2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task8 extends Task {
	public Task8(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter civic number in YYMMDD format: ");
		String civicNumber = "";
		try{
			civicNumber = scan.next("\\d{6}");
		}
		catch (NoSuchElementException ex){
			System.out.println("Invalid format for civic number");
			return;
		}
		System.out.println("The day numbers are " + civicNumber.substring(4,6));
	}
}
