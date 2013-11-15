package bunco;

import frameworkDice.Dice;

public class Game extends frameworkDice.Game
{		
	
	/**
	 * Initializes the game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeDices() {
		// Create dices collection
		for(int i=0; i<3;i++) {
			Dice newDice = new Dice(6);
			diceCollection.addDice(newDice);
		}	
	}
	
	/**
	 * Initializes the game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeTurns() {
		
		// Create turns collection
		for(int i=0; i<6;i++) {
			Turn newTurn = new Turn(this.diceCollection);
			turnCollection.addTurn(newTurn);
		}
	}
	
}
