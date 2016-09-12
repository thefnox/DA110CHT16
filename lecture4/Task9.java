package lecture4;

public class Task9 extends Task {
	public Task9(){
		System.out.println("Numbers from 1 to 100");
		int i;
		System.out.println("As a for loop:");
		for (i = 1; i <= 100; i++){
			System.out.print(i);
			if (i != 100) System.out.print(", ");
		}
		i = 0;
		System.out.println("\nAs a while loop:");
		while (i++ < 100)
		{
			System.out.print(i);
			if (i != 100) System.out.print(", ");
		}
	}
}
