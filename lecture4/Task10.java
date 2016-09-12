package lecture4;

public class Task10 extends Task {
	public Task10(){
		System.out.println("Numbers from 100 to 1");
		int i;
		System.out.println("As a for loop:");
		for (i = 100; i > 0; i--){
			System.out.print(i);
			if (i != 1) System.out.print(", ");
		}
		System.out.println();
		i = 101;
		System.out.println("As a while loop:");
		while (i-- > 1)
		{
			System.out.print(i);
			if (i != 0) System.out.print(", ");
		}
		System.out.println();
	}
}
