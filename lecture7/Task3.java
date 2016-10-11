package lecture7;

import java.util.Scanner;

public class Task3 extends Task {
	
	public enum Months{
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	}

	public Task3(Scanner scan) {
		super(scan);
		
		System.out.println("The current month is " + Months.October.toString());
		
	}

}
