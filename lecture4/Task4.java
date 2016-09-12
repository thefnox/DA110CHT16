package lecture4;

import java.util.Scanner;

public class Task4 extends Task {
	public Task4()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a float:");
		float a = scan.nextFloat();
		if (a >= 0 && a < 5){
			System.out.println("smaller");
		}
		else if (a >= 5 && a <= 10){
			System.out.println("bigger");
		}
		else
		{
			System.out.println("not valid");
		}
	}
}
