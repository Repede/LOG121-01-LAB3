/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: PlayerCollection.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerCollection
{

	private ArrayList<Player> listPlayers = new ArrayList<Player>();

	/**
	 * Add a player to our collection
	 * 
	 * @author:
	 * @param newPlayer
	 *            Player to add to our collection
	 */
	public void addPlayer(Player newPlayer)
	{
		listPlayers.add(newPlayer);
	}

	/**
	 * Create an object to iterate this playerCollection
	 * 
	 * @author:
	 * @return An object PlayerIterator to iterate our collection
	 */
	public PlayerIterator createIterator()
	{
		return new PlayerIterator(listPlayers);
	}
	
	public int getSize()
	{
		return listPlayers.size();
	}

}
