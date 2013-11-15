/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: GameTest.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-14
 *******************************************************/

package testFrameworkDice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bunco.Game;
import frameworkDice.Player;

public class GameTest
{
	@Test
	public void test_calculateWinner()
	{
		Game newGame = new Game();
		
		Player player1 = new Player("Winner");
		Player player2 = new Player("Loser1");
		Player player3 = new Player("Loser2");
		Player player4 = new Player("Loser3");
		
		player1.addScore(55);
		player2.addScore(11);
		player3.addScore(22);
		player4.addScore(33);
		
		newGame.addPlayer(player1);
		newGame.addPlayer(player2);
		newGame.addPlayer(player3);
		newGame.addPlayer(player4);
		
		Player winner = newGame.calculateWinner();
		
		assertTrue(winner.getName() == "Winner");
	}
	
}
