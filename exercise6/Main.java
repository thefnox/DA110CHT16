package exercise6;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	
	public Scanner scan;
	
	public static void main(String[] args){
		Main main = new Main();
		main.scan = new Scanner(new BufferedInputStream(System.in));
		main.mainMenu();
	}
	
	public void mainMenu(){
		while (true){
			System.out.print("Exercise 6 tasks, select task to run (1-4), 0 to quit: ");
			int choice = scan.nextInt();
			Task task = new Task();
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
				case 0:
					System.out.println("Bye!");
					return;
				default:
					System.out.println("Invalid choice.");
					break;
			}
			task.execute();
		}
	}

}
