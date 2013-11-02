/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;


public class Dice implements Comparable<Dice> {

	private int numberOfFaces;
	
	
	/**
	 * Between 2 dices, find whom has the higher value
	 * @author: 
	 * @param 	otherDice	The dice whom we which to compareTo
	 * @return 	Which Dice has higher score
	 */
	public int compareTo(Dice otherDice) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
	 * Add a player to our collection
	 * @author: 
	 * @return 	The result of the roll
	 */
	public int roll() {
		return getFace(0);
	}

	
	/**
	 * Create an object to iterate this diceCollection
	 * @author: 
	 * @return 	The face of the dice associated with the rollResult
	 */
	private int getFace(int rollResult) {
		return rollResult;
	}
	
}
