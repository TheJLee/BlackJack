package blkjack;

public class Card {
	private Values value;
	private Suits suit;
	Card(Values value, Suits suit){
		this.value = value;
		this.suit = suit;
	}
	public Values getValue() {
		return value;
	}
	public Suits getSuit() {
		return suit;
	}

}
