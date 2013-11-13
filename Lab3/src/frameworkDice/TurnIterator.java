/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: PlayerIterator.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
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
	 * Is there a next player in the loop
	 * @author: 
	 * @return 	boolean
	 */
	public boolean hasNext()
	{
		return position < turns.size();
	}

	@Override
	/**
	 * Get the next player in the list
	 * @author: 
	 * @return 	A player
	 */
	public Turn next()
	{
		if(hasNext())
		{
			return turns.get(position++);
		}
		return null;
	}

	@Override
	/**
	 * Remove the current player
	 * @author: 
	 */
	public void remove()
	{
		turns.remove(position);
	}

}
