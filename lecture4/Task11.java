package lecture4;

public class Task11 extends Task {
	public Task11(){
		System.out.println("100 odd numbers:");
		int i, x;
		System.out.println("As a for loop");
		x = 1;
		for (i=0; i<100; i++){
			System.out.print(x);
			if (i != 99) System.out.print(", ");
			x += 2;
		}
		System.out.println();
		System.out.println("As a while loop");
		x = 1;
		i = 0;
		while (i++ < 100){
			System.out.print(x);
			if (i != 100) System.out.print(", ");
			x += 2;
		}
	}
}
