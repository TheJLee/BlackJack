package blkjack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Suits {SPADE, CLUB, DIAMOND, HEART}
enum Values {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING} 

/**
 * Builds the game and then lets the GameState class handle how the game is run
 * @author TGKovu
 *
 */
public class GameBuilder {
	List <Card> deck;
	Player user;
	Dealer dealer;
	
	GameBuilder(){
		deck = new ArrayList<Card>();
		dealer = new Dealer();
		// This is initiated with constructor in GameBuilder::setPlayerMoney()
		user = new Player();
	}
	
	/**
	 * Builds the game and runs
	 */
	public void buildGameState() {
		//set user's money
		setPlayerMoney();
		// create deck of cards
		buildDeck();
		//start game
		GameState Game = new GameState();
		Game.Play();	
	}
	
	/**
	 * Builds deck of 52 cards
	 */
	public void buildDeck() {
		Card NewCard;
		for(Suits suit : Suits.values()) {
			for(Values value : Values.values()) {
				NewCard = new Card(value,suit);
				this.deck.add(NewCard);	
			}	
		}
		
	}
	/**
	 * Lets user establish play money
	 */
	public void setPlayerMoney() {
		System.out.println("How much money are you putting in?");
		try(Scanner scanner = new Scanner( System.in )){
			String Amount = scanner.nextLine();
			user.setMoney(Integer.parseInt(Amount));
		} catch (Exception e) {
	        // Handle exception
		}
	}

}
