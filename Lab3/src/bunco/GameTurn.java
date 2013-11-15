/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-14
 *******************************************************/

package bunco;

import java.util.Iterator;

import frameworkdice.DiceItem;
import frameworkdice.DiceCollection;

public class GameTurn extends frameworkdice.GameTurn
{
	/**
	 * Constructor of turn
	 * 
	 * @author	Andre-Philippe Boulet
	 * @param	diceCollection	The collection of dices assigned to this turn
	 * 
	 */
	public GameTurn(DiceCollection diceCollection)
	{
		super(diceCollection);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculate the score specific to the bunco game once the dices are rolled
	 * 
	 * @author	Andre-Philippe Boulet
	 * @return	Integer	The score
	 * 
	 */
	public int calculateScore()
	{

		int score = 0;

		Iterator<DiceItem> diceIterator = diceCollection.createIterator();
		DiceItem dice1 = diceIterator.next();
		DiceItem dice2 = diceIterator.next();
		DiceItem dice3 = diceIterator.next();

		if (dice1.getResult() == dice2.getResult() && dice1.getResult() == dice3.getResult())
		{
			if (dice1.getResult() == turnNumber)
			{
				score = 21;
			} else
			{
				score = 5;
			}
		} 
		else
		{
			diceIterator = diceCollection.createIterator();
			while (diceIterator.hasNext())
			{
				DiceItem dice = diceIterator.next();
				if (dice.getResult() == turnNumber)
				{
					score++;
				}
			}
		}

		return score;
	}

	/**
	 * Verify if the turn is done
	 * 
	 * @author	Andre-Philippe Boulet
	 * @return	boolean		is it done
	 * 
	 */
	public boolean isDone()
	{
		return rollScore == 0 || rollScore == 21;
	}
	

	/**
	 * Verbose mode to tell what happened this turn.
	 * 
	 * @author	Andre-Philippe Boulet
	 * 
	 */
	public void tellResult()
	{
		String output;
		output = Integer.toString(turnScore);

		if (turnScore == 21)
		{
			output = "Bunco!";
		}

		System.out.println("On turn " + turnNumber + ", "
				+ currentPlayer.getName() + " got a score of " + output);
	}

}
