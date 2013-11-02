/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: IStrategyGame.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/


package frameworkDice;

public interface IStrategyGame {
	
	
	/**
	 * Call subclass to find the total score for this turn.
	 * @author: 
	 * @param 	leDepuisFile   File de la pièce à déplacer
	 * @return 	A score integer
	 */
	abstract public int calculateTurnScore(); 
	
	
	/**
	 * Call subclass to find the total score for this turn.
	 * @author: 
	 * @param 	leDepuisFile   File de la pièce à déplacer
	 * @return 	The player who won
	 */
	abstract public Player calculateWinner();
}
