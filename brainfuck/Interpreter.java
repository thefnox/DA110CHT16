package brainfuck;

import java.util.Scanner;

public class Interpreter {
	
	public String errorMsg;
	
	public String program;
	
	public StringBuffer memory = new StringBuffer("" + (char) 0);
	
	public int[] jumpPositions = new int[256];
	
	public int memoryIndex = 0;
	
	public int currentJump = -1;
	
	public int programCounter = 0;
	
	public Scanner read;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interpreter inter = new Interpreter(new Scanner(System.in));
		inter.readProgram();
		boolean success = inter.executeProgram();
		if (success)
		{
			System.out.print("\nProgram executed successfully. Would you like to print the memory dump? (y/n): ");
			if (inter.read.next().toLowerCase().equals("y")) inter.dumpMemory(); 
		}
		else
		{
			System.out.printf("Execution error at position %d: %s", inter.programCounter, inter.errorMsg);
		}
	}
	
	public Interpreter(Scanner read){
		this.read = read;
	}
	
	public void readProgram(){
		System.out.print("Enter your brainfuck program to interpret: ");
		program = read.nextLine();
	}
	
	public boolean executeProgram(){
		while (programCounter < program.length()){
			char instruction = program.charAt(programCounter);
			switch(instruction){
				case '>':
					memoryIndex++;
					if (memoryIndex >= memory.length()) memory.append((char) 0);
					break;
				case '<':
					memoryIndex--;
					if (memoryIndex < 0){
						errorMsg = "Invalid memory index, must be greater than 0";
						return false;
					}
					break;
				case '+':
					memory.setCharAt(memoryIndex, (char) (memory.charAt(memoryIndex) + 1));
					break;
				case '-':
					memory.setCharAt(memoryIndex, (char) (memory.charAt(memoryIndex) - 1));
					break;
				case '.':
					System.out.print(memory.charAt(memoryIndex));
					break;
				case ',':
					char c = read.next().charAt(0);
					memory.setCharAt(memoryIndex, c);
					break;
				case '[':
					jumpPositions[++currentJump] = programCounter;
					break;
				case ']':
					if (memory.charAt(memoryIndex) == 0){
						currentJump--;
					}
					else{
						if (currentJump < 0){
							errorMsg = "Closing square bracket does not have a corresponding opening bracket.";
							return false;
						}
						else
						{
							programCounter = jumpPositions[currentJump];
						}
					}
					break;
				default:
					break;
			}
			programCounter++;
		}
		return true;
	}
	
	public void dumpMemory(){
		System.out.print("|");
		for(char c : memory.toString().toCharArray()){
			System.out.print((int) c + "|");
		}
	}

}
