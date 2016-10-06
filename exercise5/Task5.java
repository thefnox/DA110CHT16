package exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 extends Task {

	public Task5(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> generateNames(final int amount){
		ArrayList<String> list = new ArrayList<String>();
		String[] firstNames = {
			"John",
			"Luke",
			"Anna",
			"Jay",
			"Michael",
			"Steve",
			"Brian",
			"Joanna",
			"Lee",
			"Sakura",
			"Carolina",
			"Oscar",
			"Giselle",
			"Colleen"
		};
		String[] lastNames = {
			"Adams",
			"Smith",
			"Stevens",
			"Fisher",
			"Nguyen",
			"Wang",
			"Satoshi",
			"Velasquez",
			"Rodriguez",
			"Stein"
		};
		for (int i = 0; i < amount; i++){
			list.add(firstNames[(int) (Math.random() * firstNames.length % firstNames.length)] + " " + lastNames[(int) (Math.random() * lastNames.length % lastNames.length)]);
		}
		return list;
	}
	
	public String searchStart(ArrayList<String> list, char searchChar){
		String result = "";
		int count = 0;
		for(String s : list){
			if (s.toLowerCase().charAt(0) == searchChar){
				if (result.length() == 0) result = s;
				else result += ", " + s;
				count++;
			}
		}
		return result + " (" + count + " results).";
	}
	
	public String searchContains(ArrayList<String> list, char searchChar){
		String result = "";
		int count = 0;
		for(String s : list){
			if (s.toLowerCase().contains("" + searchChar)){
				if (result.length() == 0) result = s;
				else result += ", " + s;
				count++;
			}
		}
		return result + " (" + count + " results).";
	}
	
	public void execute(){
		System.out.print("Enter amount of names to generate: ");
		ArrayList<String> list = generateNames(scan.nextInt());
		System.out.print("Enter letter to search with: ");
		char c = scan.next().toLowerCase().charAt(0);
		System.out.printf("Names starting with the letter %s: %s\nNames containing the letter %s: %s\n", "" + c, searchStart(list, c), "" + c, searchContains(list, c));
	}

}
