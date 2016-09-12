package lecture4;

import java.util.Scanner;

public class Task2 extends Task {
	public Task2(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = scan.nextInt();
		if (a < 5 || a > 5){
			System.out.println("OK");
		}
	}
}
