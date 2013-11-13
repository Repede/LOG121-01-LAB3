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

public class PlayerIterator implements Iterator<Player>
{
	private ArrayList<Player> players;
	private int position = 0;
	
	public PlayerIterator(ArrayList<Player> players)
	{
		this.players = players;
	}

	@Override
	/**
	 * Is there a next player in the loop
	 * @author: 
	 * @return 	boolean
	 */
	public boolean hasNext()
	{
		return position < players.size();
	}

	@Override
	/**
	 * Get the next player in the list
	 * @author: 
	 * @return 	A player
	 */
	public Player next()
	{
		if(hasNext())
		{
			return players.get(position++);
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
		players.remove(position);
	}

}
