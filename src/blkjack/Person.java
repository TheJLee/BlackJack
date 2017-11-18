package blkjack;
import java.util.ArrayList;
import java.util.List;
/**
 * Hold generic variables and methods that both player and dealer have
 * @author J
 *
 */
public class Person {
	//current hand
	private List<Card> hand;
	//For doubling down
	private List<List<Card>> amountOfHands; 
	Person(){
		this.hand =  new ArrayList<Card>();
		this.amountOfHands = new ArrayList<List<Card>>();
	}
	/**
	 * Add your hand to the amount of hands you have
	 * @param hand
	 */
	public void addToAmountOfHands() {
		this.amountOfHands.add(this.hand);
	}
	/**
	 * Add a card to your hand
	 * @param card
	 */
	public void addToHand(Card card) {
		this.hand.add(card);
	}
	/**
	 * Removes all hand and amount of hands
	 */
	public void discardHands() {
		this.amountOfHands.clear();
	}

}
