package exercise3;

import java.util.Scanner;

public class Task8 extends Task {
	public Task8(){
		Scanner scan = new Scanner(System.in);
		int n = 13;
		int guess = 0;
		int guesses = 0;
		System.out.println("Let's play guess the number!");
		do{
			guesses++;
			System.out.print("Enter your guess: ");
			guess = scan.nextInt();
			if (guess > n)
				System.out.println("Bigger...");
			else if (guess < n)
				System.out.println("Smaller...");
		}
		while (guess != n);
		
		System.out.printf("The number %d was the right guess, you got it right after %d tries.\n", n, guesses);
	}
}
