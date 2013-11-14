/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceIterator.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated 2013-11-10
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;
import java.util.Iterator;

public class DiceIterator implements Iterator<Dice>
{
	private ArrayList<Dice> dices;
	int position = 0;

	public DiceIterator(ArrayList<Dice> dices)
	{
		this.dices = dices;
	}

	@Override
	/**
	 * Is there a next dice in the loop
	 * @author: Hugo Desjardins-Libero, Andre-Philippe Boulet
	 * @return 	A score integer
	 */
	public boolean hasNext()
	{
		return position < dices.size();
	}

	@Override
	/**
	 * Get the next dice in the list
	 * @author: Hugo Desjardins-Libero, Andre-Philippe Boulet
	 * @return 	A dice
	 */
	public Dice next()
	{
		if (hasNext())
		{
			return dices.get(position++);
		}
		return null;
	}

	@Override
	/**
	 * Remove the current dice
	 * @author: Hugo Desjardins-Libero, Andre-Philippe Boulet
	 */
	public void remove()
	{
		dices.remove(position);
	}

}
