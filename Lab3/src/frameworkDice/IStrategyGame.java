/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: IStrategyGame.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Delibero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

public interface IStrategyGame
{

	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author:
	 * @param leDepuisFile
	 * @return A score integer
	 */
	abstract public int calculateTurnScore();

	/**
	 * Call subclass to find the winner of the game.
	 * 
	 * @author:
	 * @param leDepuisFile
	 * @return The player who won
	 */
	abstract public Player calculateWinner();
}
