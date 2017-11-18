package blkjack;

import java.util.Collections;
import java.util.List;

/**
 * The main logic and actions take place in this object
 * @author J
 *
 */
public class Game extends GameBuilder {
	//play game method
	public void Play() {
		//shuffle cards
		List<Card> shuffledDeck = dealCards(Shuffle(this.deck));
		
		// while loop for entire game
			// while loop for user
				// eval cards
				// ask if they want to hit fold or dd
			// while loop for dealer
				// eval then react
			// See who wins
			
	}
	/**
	 * Distributes cards to the user and dealer.
	 * @param shuffledDeck
	 * @return Returns a deck of cards thats updated with removed cards
	 */
	public List<Card> dealCards(List<Card> shuffledDeck) {
		Card currentCard;
		for(int i = 0;i < 2;i++) {
			// First card has to be visible
			if(i == 0) {
				currentCard = shuffledDeck.remove(shuffledDeck.size()-1);
				currentCard.setVisible(true);
				this.user.addToHand(currentCard);
				currentCard = shuffledDeck.remove(shuffledDeck.size()-1);
				currentCard.setVisible(true);
				this.dealer.addToHand(currentCard);
			} else {
				this.user.addToHand(shuffledDeck.remove(shuffledDeck.size()-1));
				this.dealer.addToHand(shuffledDeck.remove(shuffledDeck.size()-1));
			}
		}
		this.user.addToAmountOfHands();
		this.dealer.addToAmountOfHands();
		return shuffledDeck;
	}
	// TODO check if bust/evaluate hands
	// TODO double down
	/**
	 * Happens after folding, gets rid of hands.
	 */
	public void clearTable() {
		this.user.discardHands();
		this.dealer.discardHands();
	}
	/**
	 * Adds card to hand for the current player
	 * @param shuffledDeck
	 * @param currentPlayer
	 * @return Returns a deck of cards thats updated with removed cards
	 */
	public List<Card> Hit(List<Card> shuffledDeck, Person currentPlayer){
		Card currentCard;
		currentCard = shuffledDeck.remove(shuffledDeck.size()-1);
		currentCard.setVisible(true);
		currentPlayer.addToHand(currentCard);
		return shuffledDeck;
	}
	/**
	 * Shuffles deck
	 * @param Deck
	 * @return A shuffled deck of cards
	 */
	public List<Card> Shuffle(List<Card> deck) {
        Collections.shuffle(deck);
		return deck;
		
	}
	/**
	 * Checks player's money to see if they ran out or not
	 * @return false for game over and true if they still have more money
	 */
	public boolean moneyCheck() {
		int currentAmount = this.user.getMoney();
		if(currentAmount <= 0)
		{
			System.out.println("Game Over, you're out of money!");
			return false;
		}
		else
		{
			return true;
		}
		
	}

}
