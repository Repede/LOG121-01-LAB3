/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceCollection.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-12
 *******************************************************/

package frameworkdice;

import java.util.ArrayList;

public class DiceCollection
{

	private ArrayList<DiceItem> listDices = new ArrayList<DiceItem>();

	/**
	 * Add a player to the collection
	 * 
	 * @author: Hugo Desjardins Delibero
	 * @param 	newDice	is a new Dice to add to this collection
	 */
	public void addDice(DiceItem newDice)
	{
		listDices.add(newDice);
	}

	/**
	 * Create an object to iterate this diceCollection
	 * 
	 * @author: Hugo Desjardins Delibero
	 * @return An object DiceIterator to iterate our collection
	 */
	public DiceIterator createIterator()
	{
		return new DiceIterator(listDices);
	}

	/**
	 * Provides the number of dices in the collection
	 * 
	 * @author: Hugo Desjardins Delibero
	 * @return The number of dices in the collection
	 */
	public int getSize()
	{
		return listDices.size();
	}

}
