package lecture4;

import java.util.Scanner;

public class Task8 extends Task {
	public Task8(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an int:");
		int n = scan.nextInt();
		System.out.println("Now give me a message:");
		scan.nextLine();
		String s = scan.nextLine();
		System.out.println("With a for loop:");
		int i;
		for (i = 0; i < n; i++){
			System.out.println("\t" + s);
		}
		i = 0;
		System.out.println("Now with a while loop:");
		while (i++ < n){
			System.out.println("\t" + s);
		}
	}
}
