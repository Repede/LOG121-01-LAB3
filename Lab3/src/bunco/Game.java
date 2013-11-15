/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-14
 *******************************************************/

package bunco;

import frameworkDice.Dice;

public class Game extends frameworkDice.Game
{		
	private int numberOfTurn = 6;
	private int numberOfDices = 3;
	private int numberOfDiceFaces = 6;
	
	
	/**
	 * Initializes the dices for the game Bunco
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeDices() {
		// Create dices collection
		for(int i=0; i<numberOfDices;i++) {
			Dice newDice = new Dice(numberOfDiceFaces);
			diceCollection.addDice(newDice);
		}	
	}
	
	/**
	 * Initializes the turns for the game Bunco
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeTurns() {
		
		// Create turns collection
		for(int i=0; i<numberOfTurn;i++) {
			Turn newTurn = new Turn(this.diceCollection);
			turnCollection.addTurn(newTurn);
		}
	}
	
}
