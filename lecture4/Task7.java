package lecture4;

import java.util.Scanner;

public class Task7 extends Task {
	public Task7(){
		Scanner scan = new Scanner(System.in);
		System.out.println("With a while loop:");
		System.out.print("Give me an int:");
		int x = scan.nextInt();
		while (x >= 0)
		{
			System.out.print("Give me an int:");
			x = scan.nextInt();
		}
		System.out.println("With a do while loop:");
		do{
			System.out.print("Give me an int:");
			x = scan.nextInt();
		}
		while(x >= 0);
	}
}
