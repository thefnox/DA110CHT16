package exercise6;

import java.util.Scanner;

//Blackjack!

public class Task4 extends Task {
	
	public Deck deck;
	
	public Deck dealerHand;
	
	public Deck playerHand;
	
	public Deck splitHand;
	
	public boolean didSplit = false;
	
	public int currentBet;
	
	public static int balance = 100;
	
	public static int losses = 0;

	public Task4() {
		// TODO Auto-generated constructor stub
	}

	public Task4(Scanner scan) {
		super(scan);
		// TODO Auto-generated constructor stub
	}
	
	//Return value of player's current hand;
	
	public int playHand(Deck hand, boolean splitAllowed){
		System.out.printf("Dealer's hand: %s. Current value %d\n", dealerHand.toString(), dealerHand.getValue());
		System.out.printf("Your hand: %s. Current value: %d. Current bet: %d\n", hand.toString(), hand.getValue(), currentBet);
		if (hand.isBust()){
			System.out.println("BUST!");
			return 0;
		}
		else if (hand.getValue() == 21){
			if (hand.isBlackjack()){
				System.out.println("21! Blackjack!");
			}
			else{
				System.out.println("21!");
			}
			return 21;
		}
		System.out.println("What would you like to do?:");
		System.out.println("\tHit.");
		System.out.println("\tStay.");
		boolean canDouble = splitAllowed && hand.size() == 1 && balance >= currentBet * 2;
		boolean canSplit = splitAllowed && hand.canSplit() && balance >= currentBet * 2;
		if (canDouble) System.out.println("\tDouble down.");
		if (canSplit) System.out.println("\tSplit.");
		do{
			System.out.print("Enter your choice: ");
			String choice = scan.next().toLowerCase();
			Card card = null;
			switch(choice){
				case "hit":
				case  "h":
					try {
						card = deck.draw();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.printf("You draw a %s\n", card);
					hand.add(card);
					return playHand(hand, splitAllowed);
				case "stay":
				case "s":
					System.out.println("You've decided to stay.");
					return hand.getValue();
				case "double down":
				case "double":
				case "d":
					if (canDouble){
						System.out.println("You double down on your current bet!");
						try {
							card = deck.draw();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						hand.add(card);
						System.out.printf("You draw a %s. Hand is now %s, value is now %d\n", card, hand, hand.getValue());
						currentBet += currentBet;
						if (hand.isBust()){
							System.out.println("BUST!");
							return 0;
						}
						return hand.getValue();
					}
					break;
				case "split":
				case "sp":
					if (canSplit){
						didSplit = true;
						System.out.println("You've split your hand!");
						try {
							card = hand.draw();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						splitHand.add(card);
						return playHand(hand, false);
					}
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}while(true);
	}
	
	//Returns value of dealer's current hand;
	
	public int playDealer(Deck hand){
		System.out.printf("Dealer's hand: %s. Current value %d\n", hand, hand.getValue());
		if (hand.isBust()){
			System.out.println("BUST!");
			return 0;
		}
		else if (hand.getValue() == 21){
			if (hand.isBlackjack()){
				System.out.println("21! Blackjack!");
			}
			else{
				System.out.println("21!");
			}
			return 21;
		}
		Card card = null;
		if (hand.getValue() < 16){
			try {
				card = deck.draw();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("Dealer draws a %s\n", card);
			hand.add(card);
			return playDealer(hand);
		}
		else{
			System.out.printf("Dealer stays at %s\n", hand.getValue());
			return hand.getValue();
		}
	}
	
	public int calculateEarnings(int currentBet, Deck playerHand, Deck dealerHand, int playerCount, int dealerCount){
		int earnings = 0;
		if (playerCount > dealerCount){
			if (playerHand.isBlackjack()){
				earnings += (int) currentBet * 1.5;
			}
			else{
				earnings += currentBet;
			}
		}
		else if (playerCount == dealerCount){
			if (playerHand.isBlackjack() && dealerHand.isBlackjack())
			{
				earnings = 0;
			}
			else if (playerHand.isBlackjack()){
				earnings += currentBet;
			}
			else if (dealerHand.isBlackjack()){
				earnings -= currentBet;
			}
			else{
				earnings = 0;
			}
		}
		else{
			earnings -= currentBet;
		}
		return earnings;
	}
	
	public boolean gameLoop(){
		do{
			System.out.printf("Enter amount to bet (Must be between 1 and %d): ", balance);
			currentBet = scan.nextInt();
			if (currentBet < 1 || currentBet > balance){
				System.out.println("Invalid amount");
			}
			else break;
		}while (true);
		dealerHand = new Deck();
		playerHand = new Deck();
		splitHand = new Deck(); 
		deck.generate();
		deck.shuffle();
		try {
			dealerHand.add(deck.draw());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			playerHand.add(deck.draw());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int playerCount = playHand(playerHand, true);
		int splitCount = 0;
		if (didSplit){
			System.out.println("Now play your split hand.");
			splitCount = playHand(splitHand, false);
		}
		System.out.println("Dealer's turn");
		int dealerCount = playDealer(dealerHand);
		int earnings = 0;
		if (didSplit){
			earnings += calculateEarnings(currentBet, splitHand, dealerHand, splitCount, dealerCount);
			earnings += calculateEarnings(currentBet, playerHand, dealerHand, playerCount, dealerCount);
		}
		else{
			earnings += calculateEarnings(currentBet, playerHand, dealerHand, playerCount, dealerCount);
		}
		balance += earnings;
		if (earnings > 0){
			System.out.printf("You have won %d credits! Your credits balance is now %d.\n", earnings, balance);
		}
		else if (earnings == 0){
			System.out.printf("You have tied. Your credits balance is still %d.\n", balance);
		}
		else{
			System.out.printf("You have lost %d credits. Your credits balance is now %d.\n", earnings, balance);
		}
		
		if (balance <= 0){
			System.out.println("YOU LOSE");
			losses++;
			balance = 100;
			return false;
		}
		return true;
	}
	
	public void execute(){
		System.out.println("Welcome to Blackjack!");
		if (losses == 0){
			System.out.println("You have not lost yet!");
		}
		else if (losses == 1){
			System.out.println("You have lost once!");
		}
		else{
			System.out.println("You have lost " + losses + " times!");
		}
		deck = new Deck();
		while (gameLoop());
	}

}
