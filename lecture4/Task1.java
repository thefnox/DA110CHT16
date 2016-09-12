package lecture4;

import java.util.Scanner;

public class Task1 extends Task {
	public Task1(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = scan.nextInt();
		if (a == 5){
			System.out.println("Good");
		}
	}
}
