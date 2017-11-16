package blkjack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Suits {SPADE, CLUB, DIAMOND, HEART}
enum Values {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING} 

//make another class called game state?
public class GameBuilder {
	List <Card> deck;
	Player user;
	Dealer dealer;
	GameBuilder(){
		deck = new ArrayList<Card>();
		dealer = new Dealer();
		user = null;
	}
	
	/**
	 * Gets the game state ready
	 */
	public void buildGameState() {
		//set user's money
		setPlayerMoney();
		// create dealer
		// create deck of cards
		buildDeck();
		//start game
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
	public void setPlayerMoney() {
		System.out.println("How much money are you putting in?");
		try(Scanner scanner = new Scanner( System.in )){
			String Amount = scanner.nextLine();
			user= new Player(Integer.parseInt(Amount));
		} catch (Exception e) {
	        // Handle exception
		}
	}
	//Check player money for status of game

}
