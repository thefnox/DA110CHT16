package lecture4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lecture 4 tasks, enter which task you would like to run (1-11): ");
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
				case 9:
					task = new Task9();
					break;
				case 10:
					task = new Task10();
					break;
				case 11:
					task = new Task11();
					break;
				default:
					System.out.println("No such task.");
					break;
			}
			System.out.println("\nEnter the next task to run (1-11), enter 0 to exit: ");
			choice = scan.nextInt();
		}
		scan.close();
	}

}
