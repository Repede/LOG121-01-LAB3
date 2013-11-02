/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: PlayerIterator.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;
import java.util.Iterator;

public class PlayerIterator implements Iterator<Player> {

	@Override
	/**
	 * Is there a next player in the loop
	 * @author: 
	 * @return 	A score integer
	 */
	public boolean hasNext() {

		return false;
	}

	@Override
	/**
	 * Get the next player in the list
	 * @author: 
	 * @return 	A player
	 */
	public Player next() {
		
		return null;
	}

	@Override
	/**
	 * Remove the current player
	 * @author: 
	 */
	public void remove() {
		
	}

}
