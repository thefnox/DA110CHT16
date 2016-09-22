package lecture5;

import java.util.Scanner;

public class Lecture5 {
	
	private Scanner _scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture5 lecture = new Lecture5();
		lecture._scan = new Scanner(System.in);
		while (true){
			lecture.taskSelector();
		}
	}
	
	public void taskSelector(){
		System.out.print("Select your task (1-14), 0 to exit: ");
		int choice = _scan.nextInt();
		switch(choice){
			case 1:
				task1();
				break;
			case 2:
				task2();
				break;
			case 3:
				System.out.print("Enter a string: ");
				_scan.nextLine();
				task3(_scan.nextLine());
				break;
			case 4:
				System.out.print("Enter two numbers: ");
				task4(_scan.nextInt(), _scan.nextInt());
				break;
			case 5:
				System.out.print("Enter three real numbers: ");
				task5(_scan.nextDouble(), _scan.nextDouble(), _scan.nextDouble());
				break;
			case 6:
				task6();
				break;
			case 7:
				task7();
				break;
			case 8:
				task8();
				break;
			case 9:
				task9();
				break;
			case 10:
				task10();
				break;
			case 11:
				task11();
				break;
			case 12:
				task12();
				break;
			case 13:
				task13();
				break;
			case 14:
				hey();
				hey3();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid task number");
				break;
		}
	}
	
	public void task1(){
		System.out.println("Hello World");
	}
	
	public void task2(){
		String s = "All work and no play makes Jack a dull boy";
		for (int i=0; i<10; i++){
			System.out.println(s);
		}
	}
	
	public void task3(String s){
		System.out.println("String is: " + s);
	}
	
	public void task4(int a, int b){
		System.out.printf("Your integers are %d and %d\n", a, b);
	}
	
	public void task5(double a, double b, double c){
		System.out.printf("%f %f %f\n", a, b, c);
		System.out.printf("%f\n", a);
		System.out.printf("%f\n", b);
		System.out.printf("%f\n", c);
	}
	
	public void task6(){
		System.out.print("Give a number: ");
		int a = _scan.nextInt();
		System.out.printf("Your number is %d.\n", a);
	}
	
	public void task7(){
		System.out.print("Give two numbers: ");
		int a = _scan.nextInt();
		int b = _scan.nextInt();
		System.out.printf("The sum of your two numbers is %d\n",add(a, b));
	}
	
	private int add(int a, int b){
		return a + b;
	}
	
	public void task8(){
		System.out.print("Give two doubles: ");
		double a = _scan.nextDouble();
		double b = _scan.nextDouble();
		System.out.printf("The sum of your doubles is %f, this is called overloading\n", add(a, b));
	}
	
	public void task9(){
		System.out.print("Give three numbers: ");
		int a = _scan.nextInt();
		int b = _scan.nextInt();
		int c = _scan.nextInt();
		int result = calculate(a, b, c);
		System.out.printf("The result for (%d * %d) + %d is %d\n", a, b, c, result); 
	}
	
	private int calculate(int a, int b, int c){
		return (a * b) + c;
	}
	
	private double add(double a, double b){
		return a + b;
	}
	
	public void task10(){
		int a = readInt();
		int b = readInt();
		int c = readInt();
		int d = readInt();
		int e = readInt();
		int f = readInt();
		int g = readInt();
		int h = readInt();
		int i = readInt();
		int j = readInt();
		System.out.printf("You entered %d, %d, %d, %d, %d, %d, %d, %d, %d and %d\n", a, b, c, d, e, f, g, h, i, j );
	}
	
	private int readInt(){
		System.out.print("Enter an integer: ");
		return _scan.nextInt();
	}
	
	public void task11(){
		int a = readInt();
		int b = readInt();
		int c = readInt();
		int d = readInt();
		int e = readInt();
		int f = readInt();
		int g = readInt();
		int h = readInt();
		int i = readInt();
		int j = readInt();
		System.out.print("You entered: ");
		printInt(a);
		printInt(b);
		printInt(c);
		printInt(d);
		printInt(e);
		printInt(f);
		printInt(g);
		printInt(h);
		printInt(i);
		printInt(j);
	}
	
	private void printInt(int s){
		System.out.println(s);
	}
	
	public void task12(){
		int a = readInt();
		int b = readInt();
		System.out.printf("%d divided by %d is %f\n", a, b, divide(a, b));
	}
	
	private double divide(int a, int b){
		return (double) a / (double) b;
	}
	
	public void task13(){
		hey();
	}
	
	private void hey(){
		System.out.println("Hey!");
		hey2();
	}
	
	private void hey2(){
		System.out.println("Hey!!");
	}
	
	public static void hey3(){
		System.out.println("Hey but static!");
	}

}
