package test;

import org.junit.Test;
import blkjack.Player;

public class Unit_Tests {

	@Test
	public void Test_Player_Bet_Method() {
		Player Player= new Player(15);
		System.out.println(Player.bet());
	}
}
