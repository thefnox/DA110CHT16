package exercise5;

import java.util.Scanner;

public class Main {
	
	Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.scan = new Scanner(System.in);
		while (main.mainMenu());
		main.scan.close();
	}
	
	public boolean mainMenu(){
		System.out.print("Exercise 5 tasks, select which task to run (1-6), 0 to exit: ");
		Task task = null;
		switch(scan.nextInt()){
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
			case 0:
				System.out.println("Bye now!");
				return false;
			default:
				System.out.println("Invalid option");
				break;
		}
		task.execute();
		return true;
	}

}
