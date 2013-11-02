/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: DiceIterator.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;
import java.util.Iterator;

public class DiceIterator implements Iterator<Dice> {

	@Override
	/**
	 * Is there a next dice in the loop
	 * @author: 
	 * @return 	A score integer
	 */
	public boolean hasNext() {

		return false;
	}

	@Override
	/**
	 * Get the next dice in the list
	 * @author: 
	 * @return 	A dice
	 */
	public Dice next() {
		
		return null;
	}

	@Override
	/**
	 * Remove the current dice
	 * @author: 
	 */
	public void remove() {
		
	}

}
