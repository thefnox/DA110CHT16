package exercise4;

import java.util.Scanner;

public class Task3 extends Task {

	public Task3(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public double kiloToPound(double kilo){
		return kilo * 2.20462;
	}
	
	public double meterToFeet(double meter){
		return meter * 3.28084;
	}
	
	public double feetToMeter(double feet){
		return feet * 0.3048;
	}
	
	public double poundToKilo(double pound){
		return pound * 0.453592;
	}
	
	public void execute(){
		while (true){
			System.out.print("IMPERIUM CONVERTATON:\n\t1)Kilo to pound\n\t2)Meter to feet\n\t3)Pound to kilo\n\t4)Feet to meter\n\t0)Exit\nEnter your selection:\n");
			int choice = scan.nextInt();
			double x;
			switch(choice){
			case 1:
				System.out.print("Enter amount in kilos to convert: ");
				x = scan.nextDouble();
				System.out.printf("%.2f kilos is %.2f pounds.\n", x, kiloToPound(x));
				break;
			case 2:
				System.out.print("Enter amount in meters to convert: ");
				x = scan.nextDouble();
				System.out.printf("%.2f meters is %.2f feet.\n", x, meterToFeet(x));
				break;
			case 3:
				System.out.print("Enter amount in pounds to convert: ");
				x = scan.nextDouble();
				System.out.printf("%.2f pounds is %.2f kilos.\n", x, poundToKilo(x));
				break;
			case 4:
				System.out.print("Enter amount in feet to convert: ");
				x = scan.nextDouble();
				System.out.printf("%.2f feet is %.2f meters.\n", x, feetToMeter(x));
				break;
			case 0:
				scan.nextLine();
				System.out.print("Really dude? (yes/no): ");
				if (scan.nextLine().toLowerCase().equals("yes")) return;
				break;
				default:
					System.out.println("Invalid selection.");
					break;
			}
		}
	}

}
