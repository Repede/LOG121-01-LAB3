/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceCollection.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;

public class TurnCollection
{

	private ArrayList<Turn> listTurns;

	/**
	 * Add a player to our collection
	 * 
	 * @author:
	 * @param newDice
	 *            is a new Dice to add to this collection
	 */
	public void addTurn(Turn newTurn)
	{
		listTurns.add(newTurn);
	}

	/**
	 * Create an object to iterate this diceCollection
	 * 
	 * @author:
	 * @return An object DiceIterator to iterate our collection
	 */
	public TurnIterator createIterator()
	{
		return new TurnIterator(listTurns);
	}
	
	public int getSize()
	{
		return listTurns.size();
	}

}
