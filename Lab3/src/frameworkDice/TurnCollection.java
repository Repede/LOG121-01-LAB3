/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: TurnCollection.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-10 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;

public class TurnCollection
{

	private ArrayList<Turn> listTurns = new ArrayList<Turn>();

	/**
	 * Add a turn to our collection
	 * 
	 * @author: Andre-Philippe Boulet
	 * @param newTurn
	 *            is a new turn to add to this collection
	 */
	public void addTurn(Turn newTurn)
	{
		listTurns.add(newTurn);
	}

	/**
	 * Create an object to iterate this diceCollection
	 * 
	 * @author: Andre-Philippe Boulet
	 * @return An object TurnIterator to iterate our collection
	 */
	public TurnIterator createIterator()
	{
		return new TurnIterator(listTurns);
	}
	
	/**
	 * Gets the collection's size
	 * 
	 * @author: Andre-Philippe Boulet
	 * @return The size of the collection
	 */
	public int getSize()
	{
		return listTurns.size();
	}

}
