package lecture3;

import java.util.Scanner;

public class Task1 extends Task{
	public Task1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
	    System.out.println("Your numbers are " + a + " and " + b);
	}
}
