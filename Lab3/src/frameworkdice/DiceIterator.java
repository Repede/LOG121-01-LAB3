/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceIterator.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated 2013-11-10
 *******************************************************/

package frameworkdice;

import java.util.ArrayList;
import java.util.Iterator;

public class DiceIterator implements Iterator<DiceItem>
{
	private ArrayList<DiceItem> dices;
	int position = 0;

	public DiceIterator(ArrayList<DiceItem> dices)
	{
		this.dices = dices;
	}

	@Override
	/**
	 * Is there a next dice in the loop
	 * @author: Hugo Desjardins-Libero
	 * @return 	A score integer
	 */
	public boolean hasNext()
	{
		return position < dices.size();
	}

	@Override
	/**
	 * Get the next dice in the list
	 * @author	Hugo Desjardins-Libero
	 * @edited	Andre-Philippe Boulet
	 * @return 	A dice
	 */
	public DiceItem next()
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
	 * @author: Hugo Desjardins-Libero
	 */
	public void remove()
	{
		dices.remove(position);
	}

}
