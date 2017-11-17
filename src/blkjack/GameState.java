package blkjack;

import java.util.Collections;
import java.util.List;

/**
 * The main logic and actions take place in this object
 * @author TGKovu
 *
 */
public class GameState extends GameBuilder {
	//play game method
	public void Play() {
		//shuffle cards
		List<Card> shuffledDeck = Shuffle(deck);
		shuffledDeck = dealCards(shuffledDeck);
	}
	/**
	 * Distributes the to user and dealer.
	 * @param shuffledDeck
	 * @return Returns a deck of cards thats updated with removed cards
	 */
	public List<Card> dealCards(List<Card> shuffledDeck) {
		
		//gives user first 2 cards then dealer
		//remove from deck
		return shuffledDeck;
	}
	// TODO check if bust/evaluate hands
	// TODO hit
	// TODO double down
	// TODO Clear table
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
		int currentAmount = user.getMoney();
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
