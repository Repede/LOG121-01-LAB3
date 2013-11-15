/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: TurnIterator.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-10 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;
import java.util.Iterator;

public class TurnIterator implements Iterator<Turn>
{
	private ArrayList<Turn> turns;
	private int position = 0;

	public TurnIterator(ArrayList<Turn> turns)
	{
		this.turns = turns;
	}

	@Override
	/**
	 * Is there a next turn in the loop
	 * @author	Andre-Philippe Boulet
	 * @return 	boolean
	 */
	public boolean hasNext()
	{
		return position < turns.size();
	}

	@Override
	/**
	 * Get the next turn in the list
	 * @author	Andre-Philippe Boulet
	 * @return 	A turn
	 */
	public Turn next()
	{
		if (hasNext())
		{
			return turns.get(position++);
		}
		return null;
	}

	@Override
	/**
	 * Remove the current turn
	 * @author	Andre-Philippe Boulet
	 */
	public void remove()
	{
		turns.remove(position);
	}

}
