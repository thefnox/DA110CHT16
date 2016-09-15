package exercise3;

public class Task5 extends Task {
	public Task5(){
		int i, j;
		i = 6;
		while (i-- > 1){
			j = i * 2;
			while (j-- > 0){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (i=0; i<4; i++){
			for (j=0; j<5; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (i=1; i<7; i++){
			for (j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (i=0; i<4; i++){
			for (j=0; j<9; j++){
				if ((j + i)% 2 == 0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println();
		int sum = 1;
		for (i=0; i<4; i++){
			for (j = 0; j<sum; j++){
				System.out.print("*");
			}
			System.out.print("\n");
			sum += sum;
		}
	}
}
