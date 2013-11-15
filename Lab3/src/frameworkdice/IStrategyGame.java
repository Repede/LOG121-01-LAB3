/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: IStrategyGame.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Delibero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkdice;

public interface IStrategyGame
{

	/**
	 * Call subclass to find the winner of the game.
	 * 
	 * @author	Andre-Philippe Boulet
	 * @return 	The Player who won the game
	 */
	abstract public Player calculateWinner();
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude Payette
	 */
	abstract public void displayScore();
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude Payette
	 */
	abstract public void initialize();
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude Payette
	 */
	abstract public void initializePlayers();
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude Payette
	 */
	abstract public void initializeDices();
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude Payette
	 */
	abstract public void initializeTurns();
}