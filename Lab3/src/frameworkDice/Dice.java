/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-11
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
	 * @author: Hugo Desjardins Delibero, Andre-Philippe Boulet
	 * @param otherDice
	 *            The dice whom we which to compareTo
	 * @return Which Dice has higher score
	 */
	public int compareTo(Dice otherDice)
	{
		return Integer.compare(this.currentFaceNumber,
				otherDice.currentFaceNumber);
	}

	/**
	 * Add a player to our collection
	 * 
	 * @author:Hugo Desjardins Delibero, Andre-Philippe Boulet
	 * @return The result of the roll
	 */
	public int roll()
	{
		int face = 1 + (int) Math.round(Math.random() * (numberOfFaces - 1));
		currentFaceNumber = getFace(face);
		return currentFaceNumber;
	}

	/**
	 * Gets the dice's face result
	 * 
	 * @author:Hugo Desjardins Delibero, Andre-Philippe Boulet
	 * @return The face number
	 */
	public int getResult()
	{
		return currentFaceNumber;
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
