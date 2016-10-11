package lecture7;

import java.util.Scanner;

public class Task4 extends Task {

	public Task4(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	private class Car{
		public String brand;
		public int productionYear;
		
		public Car(String brand){
			this.brand = brand;
		}
		
		public Car(String brand, int productionYear){
			this.brand = brand;
			this.productionYear = productionYear;
		}
	}
	
	public void execute(){
		Car car1 = new Car("Ferrari");
		Car car2 = new Car("Lamborghini", 1999);
		System.out.printf("Our two cars are a %s, and a %s from %d\n", car1.brand, car2.brand,car2.productionYear);
	}

}
