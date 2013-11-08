/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

public class Dice implements Comparable<Dice>
{

	private int numberOfFaces;
	private int currentFaceNumber;

	public Dice()
	{
		numberOfFaces = 6;
	}

	public Dice(int numOffaces)
	{
		numberOfFaces = numOffaces;
	}

	/**
	 * Between 2 dices, find whom has the higher value
	 * 
	 * @author:
	 * @param otherDice
	 *            The dice whom we which to compareTo
	 * @return Which Dice has higher score
	 */
	public int compareTo(Dice otherDice)
	{
		return Integer.compare(this.currentFaceNumber, otherDice.currentFaceNumber);
	}

	/**
	 * Add a player to our collection
	 * 
	 * @author:
	 * @return The result of the roll
	 */
	public int roll()
	{
		int face = 1 + (int) Math.round(Math.random() * (numberOfFaces - 1));
		return getFace(face);
	}

	/**
	 * Create an object to iterate this diceCollection
	 * 
	 * @author:
	 * @return The face of the dice associated with the rollResult
	 */
	private int getFace(int rollResult)
	{
		return rollResult;
	}

}
