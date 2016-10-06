package exercise5;

import java.util.Scanner;

public class Task2 extends Task {

	public Task2(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public void execute(){
		int[] numbers = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int currentNum = 1;
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] != currentNum){
				System.out.printf("Number %d is missing!\n", currentNum);
				currentNum++;
			}
			else {
				System.out.printf("Number %d is there...\n", currentNum);
			}
			currentNum++;
		}
	}

}
