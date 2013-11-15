/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Player.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-10
 *******************************************************/

package frameworkDice;

public class Player implements Comparable<Player>
{

	private String name;
	private int score;

	public Player(String name)
	{
		this.name = name;
		score = 0;
	}

	public String getName()
	{
		return name;
	}

	/**
	 * Between 2 players, find whom has the higher score
	 * 
	 * @author: Hugo Desjardins-Libero
	 * @param 	otherPlayer	The player whom we which to compareTo
	 * @return 	Which Player has higher score
	 */
	public int compareTo(Player otherPlayer)
	{
		return Integer.compare(this.score, otherPlayer.score);
	}
	
	/**
	 * Adds points to the player
	 * 
	 * @author: 	Andre-Philippe Boulet
	 * @param score	how many points to give (negative value to remove)
	 */
	public void addScore(int score)
	{
		this.score += score;
	}
	
	/**
	 * Gets the player's score
	 * 
	 * @author: Hugo Desjardins-Libero
	 * @return The player's score
	 */
	public int getScore()
	{
		return this.score;
	}

}
