package lecture3;

import java.util.Scanner;

public class Task8 extends Task {
	public Task8(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Write two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == b)
			System.out.println("They're the same number");
		else
			System.out.println("They're different numbers");
	}
}
