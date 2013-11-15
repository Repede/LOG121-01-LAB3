/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: IStrategyTurn.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Delibero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

public interface IStrategyTurn
{

	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author	Andre-Philippe Boulet
	 * @return 	A score integer
	 */
	abstract public int calculateScore();

	/**
	 * The current player playing
	 * 
	 * @author	Andre-Philippe Boulet
	 */
	abstract public void setCurrentPlayer(Player player);
	
	/**
	 * Simple method to show turn results
	 * 
	 * @author	Andre-Philippe Boulet
	 */
	abstract public void tellResult();
	
	/**
	 * Set the current turn number
	 * 
	 * @author	Andre-Philippe Boulet
	 */
	abstract public void setTurnNumber(int number);
	
	/**
	 * Is the turn done 
	 * 
	 * @author	Andre-Philippe Boulet
	 */
	abstract public boolean isDone();
	
	/**
	 * Roll all dices then calculate score
	 * 
	 * @author	Andre-Philippe Boulet
	 */
	abstract public void roll();
}