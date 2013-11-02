/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceCollection.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;

public class DiceCollection {

	private ArrayList<Dice> listDices;
	
	/**
	 * Add a player to our collection
	 * @author: 
	 * @param 	newDice   File de la pièce à déplacer
	 */
	public void addDice(Dice newDice) {
		
	}

	
	/**
	 * Create an object to iterate this diceCollection
	 * @author: 
	 * @return 	An object DiceIterator to iterate our collection
	 */
	public DiceIterator createIterator() {
		return new DiceIterator();
	}
	
}
