package blkjack;
import java.util.Scanner;
/**
 * Player object is the user which let them be in control with their money
 * @author TGKovu
 *
 */
public class Player extends Person{
	private int money;
	
	public Player() {
	}
	/**
	 * Returns a valid bet amount
	 * @return
	 */
	public int Bet()
	{
		int BetAmount = 0;
		String Amount;
		boolean invalid = true;

		while(invalid) {
			System.out.println("Place your be.");
			try(Scanner scanner = new Scanner( System.in )){
				Amount = scanner.nextLine();
				BetAmount = Integer.parseInt(Amount);
				// Check if the bet is within their spending range.
				if(BetAmount < getMoney() && BetAmount != 0) {
					System.out.println("Good bet of $" + BetAmount + "!");
					// TODO subtract amount from money 
					this.money -= BetAmount;
					invalid = false;
				} else {
					System.out.println("Invalid Try Again");
				}
			} catch (Exception e) {
		        // Handle exception
			}
		}
		return BetAmount;
	}

	int getMoney() {
		return money;
	}

	void setMoney(int money) {
		this.money = money;
	}
}
