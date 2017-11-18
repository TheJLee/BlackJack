package blkjack;
/**
 * Card object
 * @author J
 *
 */
public class Card {
	private Values value;
	private Suits suit;
	private boolean visible;
	Card(Values value, Suits suit){
		this.value = value;
		this.suit = suit;
		this.visible=false;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Values getValue() {
		return value;
	}
	public Suits getSuit() {
		return suit;
	}

}
