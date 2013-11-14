/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Turn.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-10
 *******************************************************/

package frameworkDice;

public class Turn
{
	protected Player currentPlayer;
	protected DiceCollection diceCollection;
	protected int rollScore;
	protected int turnScore;
	protected int turnNumber;

	public Turn(DiceCollection diceCollection)
	{
		this.diceCollection = diceCollection;
		this.rollScore = 0;
	}
	
	/**
	 * Rolls the dices in the collection
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void roll()
	{
		rollScore = 0;

		DiceIterator iter = diceCollection.createIterator();
		while (iter.hasNext())
		{
			iter.next().roll();
		}

		rollScore = calculateScore();
		turnScore += rollScore;
		currentPlayer.addScore(rollScore);
	}

	/**
	 * Calculates the score for the turn
	 * @author: Andre-Philippe Boulet, Hugo Desjardins-Libero, Maude Payette
	 * @return 	integer
	 */
	public int calculateScore()
	{
		return 0;
	}

	/**
	 * Checks if turn is over
	 * @author: Andre-Philippe Boulet, Hugo Desjardins-Libero, Maude Payette
	 * @return 	boolean
	 */
	public boolean isDone()
	{
		return true;
	}

	/**
	 * Sets the current player
	 * @author: Andre-Philippe Boulet, Hugo Desjardins-Libero, Maude Payette
	 * @return 	boolean
	 */
	public void setCurrentPlayer(Player player)
	{
		currentPlayer = player;
		turnScore = 0;
	}

	/**
	 * Set the current turn number
	 * 
	 * @author:  Andre-Philippe Boulet
	 * @param number
	 *            The current turn number *
	 */
	public void setTurnNumber(int number)
	{
		turnNumber = number;
	}

	/**
	 * Outputs the results
	 * 
	 * @author:  Andre-Philippe Boulet
	 */
	public void tellResult()
	{
		System.out.println("On turn " + turnNumber + ", "
				+ currentPlayer.getName() + " got a score of " + turnScore);
	}
}
