/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: TurnTest.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-14
 *******************************************************/

package testframeworkdice;
import bunco.GameTurn;
import frameworkdice.DiceItem;
import frameworkdice.DiceCollection;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Maude
 *
 */
public class TurnTest
{

	@Test
	public void test_calculateScore()
	{
		DiceItem dice1 = new DiceItem();
		DiceItem dice2 = new DiceItem();
		DiceItem dice3 = new DiceItem();
		
		// Cas 1 : Score quand les 3 dés = 2 et le numéro de tour = 2
		dice1.setResult(2);
		dice2.setResult(2);
		dice3.setResult(2);

		DiceCollection collection1 = new DiceCollection();
		
		collection1.addDice(dice1);
		collection1.addDice(dice2);
		collection1.addDice(dice3);
		
		GameTurn turn = new GameTurn(collection1);
		turn.setTurnNumber(2);
		
		int score = turn.calculateScore();
		
		// Le score = 21
		assertTrue(score == 21);
		
		
		
		
		// Cas 2 : Score quand les 3 dés = 4 et le numéro de tour = 2
		dice1.setResult(4);
		dice2.setResult(4);
		dice3.setResult(4);
		
		DiceCollection collection2 = new DiceCollection();

		collection2.addDice(dice1);
		collection2.addDice(dice2);
		collection2.addDice(dice3);
		
		turn = new GameTurn(collection2);
		turn.setTurnNumber(2);
		
		score = turn.calculateScore();
		
		// Le score = 5
		assertTrue(score == 5);
		
		
		
		// Cas 3 : Score quand un seul dé = 3 et le numéro de tour = 3
		dice1.setResult(3);
		dice2.setResult(4);
		dice3.setResult(5);
		
		DiceCollection collection3 = new DiceCollection();

		collection3.addDice(dice1);
		collection3.addDice(dice2);
		collection3.addDice(dice3);
		
		turn = new GameTurn(collection3);
		turn.setTurnNumber(3);
		
		score = turn.calculateScore();
		
		// Le score = 1
		assertTrue(score == 1);
		
		
		
		
		// Cas 4 : Score quand deux dés = 6 et le numéro de tour = 6
		dice1.setResult(3);
		dice2.setResult(6);
		dice3.setResult(6);
		
		DiceCollection collection4 = new DiceCollection();

		collection4.addDice(dice1);
		collection4.addDice(dice2);
		collection4.addDice(dice3);
		
		turn = new GameTurn(collection4);
		turn.setTurnNumber(6);
		
		score = turn.calculateScore();
		
		// Le score = 2
		assertTrue(score == 2);
		
		
		
		
		
		// Cas 5 : Score quand les dés sont différents du numéro de tour
		dice1.setResult(1);
		dice2.setResult(6);
		dice3.setResult(3);
		
		DiceCollection collection5 = new DiceCollection();

		collection5.addDice(dice1);
		collection5.addDice(dice2);
		collection5.addDice(dice3);
		
		turn = new GameTurn(collection5);
		turn.setTurnNumber(5);
		
		score = turn.calculateScore();
		
		// Le score = 0
		assertTrue(score == 0);
		
	}

}
