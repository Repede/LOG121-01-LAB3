/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-14
 *******************************************************/

package bunco;

import frameworkdice.DiceItem;

public class BuncoGame extends frameworkdice.DiceGame
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
			DiceItem newDice = new DiceItem(numberOfDiceFaces);
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
			GameTurn newTurn = new GameTurn(this.diceCollection);
			turnCollection.addTurn(newTurn);
		}
	}
	
}
