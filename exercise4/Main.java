package exercise4;

import java.util.Scanner;

public class Main {
	
	Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.scan = new Scanner(System.in);
		while(main.mainMenu());
		main.scan.close();
	}
	
	boolean mainMenu(){
		System.out.print("Exercise 2, enter which task to run (1-7), 0 to exit: ");
		int choice = scan.nextInt();
		Task task = new Task(scan);
		switch(choice){
			case 1:
				task = new Task1(scan);
				break;
			case 2:
				task = new Task2(scan);
				break;
			case 3:
				task = new Task3(scan);
				break;
			case 4:
				task = new Task4(scan);
				break;
			case 5:
				task = new Task5(scan);
				break;
			case 6:
				task = new Task6(scan);
				break;
			case 7:
				task = new Task7(scan);
				break;
			case 0:
				return false;
			default:
				System.out.println("Invalid task.");
				break;
		}
		task.execute();
		System.out.println();
		return true;
	}

}
