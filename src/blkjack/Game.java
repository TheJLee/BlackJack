package blkjack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Suits {SPADE, CLUB, DIAMOND, HEART}
enum Values {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING} 

public class Game {
	List <Card> deck;
	Player user;
	Dealer dealer;
	Game(){
		deck = new ArrayList<Card>();
		dealer = new Dealer();
		user = null;
	}
	
	/**
	 * Starts the game
	 */
	public void initGame() {
		// create player
		System.out.println("How much money are you putting in?");
		try(Scanner scanner = new Scanner( System.in )){
			String Amount = scanner.nextLine();
			user= new Player(Integer.parseInt(Amount));
		} catch (Exception e) {
	        // Handle exception
		}
		// create dealer
		// create deck of cards
		buildDeck();
	}
	
	//play game method
	//check if bust
	public void buildDeck() {
		Card NewCard;
		for(Suits suit : Suits.values()) {
			for(Values value : Values.values()) {
				NewCard = new Card(value,suit);
				this.deck.add(NewCard);	
			}	
		}	
	}
	//Check player money for status of game

}
