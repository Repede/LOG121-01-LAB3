/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: PlayerCollection.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;
//import java.util.Collections;

public class PlayerCollection
{

	private ArrayList<Player> listPlayers = new ArrayList<Player>();

	/**
	 * Add a player to our collection
	 * 
	 * @author	Andre-Philippe Boulet, Hugo Desjardins-Libero
	 * @param 	newPlayer	Player to add to our collection
	 */
	public void addPlayer(Player newPlayer)
	{
		listPlayers.add(newPlayer);
	}

	/**
	 * Create an object to iterate this playerCollection
	 * 
	 * @author 	Hugo Desjardins-Libero
	 * @return 	An object PlayerIterator to iterate our collection
	 */
	public PlayerIterator createIterator()
	{
		return new PlayerIterator(listPlayers);
	}

	/**
	 * Gets the size of the collection
	 * 
	 * @author: Hugo Desjardins-Libero
	 * @return The collection's size
	 */
	public int getSize()
	{
		return listPlayers.size();
	}

}
