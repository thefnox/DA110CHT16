package lecture7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("Enter task to run (1-9): ");
			Task task = new Task(scan);
			int choice = scan.nextInt();
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
			case 8:
				task = new Task8(scan);
				break;
			case 9:
				task = new Task9(scan);
				break;
				default:
					System.out.println("Invalid task");
			}
			task.execute();
		}
	}

}
