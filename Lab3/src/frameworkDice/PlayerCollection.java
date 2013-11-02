/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: PlayerCollection.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

import java.util.ArrayList;

public class PlayerCollection {

	private ArrayList<Player> listPlayers;
	
	/**
	 * Add a player to our collection
	 * @author: 
	 * @param 	newPlayer   File de la pièce à déplacer
	 */
	public void addPlayer(Player newPlayer) {
		
	}

	
	/**
	 * Create an object to iterate this playerCollection
	 * @author: 
	 * @return 	An object PlayerIterator to iterate our collection
	 */
	public PlayerIterator createIterator() {
		return new PlayerIterator();
	}
	
}
