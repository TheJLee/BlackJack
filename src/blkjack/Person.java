package blkjack;
import java.util.ArrayList;
import java.util.List;

public class Person {
	List<Card> hand;
	Person(){
		this.hand =  new ArrayList<Card>();
	}
	public void hit(Card card) {
		hand.add(card);
	}
}
