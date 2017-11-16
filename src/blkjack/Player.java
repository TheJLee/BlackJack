package blkjack;
import java.util.Scanner;

public class Player extends Person{
	int money;
	
	public Player(int money)
	{
		this.money = money;
		
	}
	
	public int bet()
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
				if(BetAmount < money && BetAmount != 0) {
					System.out.println("Good bet of $" + BetAmount + "!");
					return BetAmount;
				} else {
					System.out.println("Invalid Try Again");
				}
			} catch (Exception e) {

		        // Handle exception
			}
		}
		return BetAmount;
	}
	
}
