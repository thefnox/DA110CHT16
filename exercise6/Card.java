package exercise6;

public class Card {
	
	public enum Suits{
		Spade,
		Heart,
		Diamond,
		Club
	}
	
	public enum Ranks{
		Ace,
		Two,
		Three,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Ten,
		Jack,
		Queen,
		King
	}
	
	private Suits suit;
	
	public Suits getSuit() {
		return suit;
	}

	public Ranks getRank() {
		return rank;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	public void setRank(Ranks rank) {
		this.rank = rank;
	}
	
	public String getSuitString(){
		switch (suit){
			case Spade:
				return "\u2660";
			case Heart:
				return "\u2665";
			case Diamond:
				return "\u2666";
			case Club:
				return "\u2663";
			default:
				return "?";
		}
	}
	
	public String getRankString(){
		switch(rank){
			case Ace:
				return "A";
			case Two:
				return "2";
			case Three:
				return "3";
			case Four:
				return "4";
			case Five:
				return "5";
			case Six:
				return "6";
			case Seven:
				return "7";
			case Eight:
				return "8";
			case Nine:
				return "9";
			case Ten:
				return "10";
			case Jack:
				return "J";
			case Queen:
				return "Q";
			case King:
				return "K";
			default:
				return "?";
		}
	}
	
	public String toString(){
		return getSuitString() + getRankString();
	}

	private Ranks rank;

	public Card() {
		// TODO Auto-generated constructor stub
	}
	
	public Card(Suits suit, Ranks rank){
		this.suit = suit;
		this.rank = rank;
	}

}
