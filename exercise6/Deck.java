package exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cardList;
	
	public void add(Card card){
		cardList.add(card);
	}
	
	public int size(){
		return cardList.size();
	}
	
	public boolean canSplit(){
		return cardList.size() == 2 && cardList.get(0).getRank() == cardList.get(1).getRank();
	}
	
	public boolean isBlackjack(){
		return cardList.size() == 2 && getValue() == 21;
	}
	
	public boolean isBust(){
		return getValue() > 21;
	}
	
	public int getValue(){
		int amount = 0;
		int aceCount = 0;
		for(Card card : cardList){
			switch(card.getRank()){
				case Ace:
					amount += 11;
					aceCount++;
					break;
				case Two:
					amount += 2;
					break;
				case Three:
					amount += 3;
					break;
				case Four:
					amount += 4;
					break;
				case Five:
					amount += 5;
					break;
				case Six:
					amount += 6;
					break;
				case Seven:
					amount += 7;
					break;
				case Eight:
					amount += 8;
					break;
				case Nine:
					amount += 9;
					break;
				case Ten:
					amount += 10;
					break;
				case Jack:
					amount += 10;
					break;
				case Queen:
					amount += 10;
					break;
				case King:
					amount += 10;
					break;
				default:
					break;
			}
			while (amount > 21 && aceCount > 0){
				amount -= 10;
				aceCount--;
			}
		}
		return amount;
	}
	
	public void generate(){
		if (cardList != null){
			cardList.clear();
		}
		for (Card.Suits suit : Card.Suits.values()){
			for (Card.Ranks rank : Card.Ranks.values()){
				Card card = new Card(suit, rank);
				cardList.add(card);
			}
		}
	}
	
	public void shuffle(){
		long seed = System.nanoTime();
		Collections.shuffle(cardList, new Random(seed));
	}
	
	public Card draw() throws Exception{
		if (cardList.isEmpty()){
			Exception ex = new Exception("Deck  is empty.");
			throw ex;
		}
		else{
			Card card = cardList.get(cardList.size() - 1);
			cardList.remove(cardList.size() - 1);
			return card;
		}
	}
	
	public String toString(){
		String s = "";
		for (int i = 0; i < cardList.size(); i++){
			if (i > 0){
				s += ", ";
			}
			s += cardList.get(i).toString();
		}
		return s;
	}

	public Deck() {
		// TODO Auto-generated constructor stub
		cardList = new ArrayList<Card>();
	}

}
