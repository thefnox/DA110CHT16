package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exercise 3 tasks, enter which task you would like to run (1-8): ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		while (choice > 0){
			Task task;
			switch(choice){
				case 1:
					task = new Task1();
					break;
				case 2:
					task = new Task2();
					break;
				case 3:
					task = new Task3();
					break;
				case 4:
					task = new Task4();
					break;
				case 5:
					task = new Task5();
					break;
				case 6:
					task = new Task6();
					break;
				case 7:
					task = new Task7();
					break;
				case 8:
					task = new Task8();
					break;
				default:
					System.out.println("No such task.");
					break;
			}
			System.out.println("\nEnter the next task to run (1-8), enter 0 to exit: ");
			choice = scan.nextInt();
		}
		scan.close();

	}

}
