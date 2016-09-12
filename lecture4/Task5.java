package lecture4;

import java.util.Scanner;

public class Task5 extends Task {
	public Task5()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yes or no:");
		String a = scan.nextLine();
		switch(a){
			case "yes":
				System.out.println("good");
				break;
			case "no":
				System.out.println("bad");
				break;
			default:
				System.out.println("error");
				break;
		}
	}
}
