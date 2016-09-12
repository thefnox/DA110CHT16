package lecture4;

import java.util.Scanner;

public class Task3 extends Task {
	public Task3(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = scan.nextInt();
		if (a < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}
	}
}
