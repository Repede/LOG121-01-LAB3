/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Game.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/

package frameworkDice;

public class Game implements IStrategyGame
{
	private int numberOfTurn;
	private DiceCollection diceCollection;
	private PlayerCollection playerCollection;

	public Game(int numOfTurn, int numOfDice)
	{
		numberOfTurn = numOfTurn;
	}
	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author:
	 * @param leDepuisFile
	 * 
	 * @return A score integer
	 */
	public int calculateTurnScore()
	{
		return 0;
	}

	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author:
	 * @param leDepuisFile
	 * 
	 * @return The player who won
	 */
	public Player calculateWinner()
	{
		Player winner = null;
		int winscore = 0;
		PlayerIterator iter = playerCollection.createIterator();
		while(iter.hasNext())
		{
			Player curPlayer = iter.next();
			if(curPlayer.getScore() > winscore)
			{
				winscore = curPlayer.getScore();
				winner = curPlayer;
				
			}
		}
		return winner;
	}

	public void initialize()
	{

		// GetDices : DiceCollection

		// GetNumberOfTurn

		// AskPlayerInformation
	}

	public void play()
	{
		
		// Foreach Turns
		// Turn currentTurn = new Turn(DiceCollection);
		// While( PlayerCollection.hasNext() )
		// currentTurn.setCurrentPlayer(PlayerCollection.next());
		// Do
		// Turn.roll(currentPlayer)
		// While turn.isDone()

		// Calculate Winner
		// Game.announeWinner(Player)
	}

	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author:
	 * @param leDepuisFile
	 * 
	 * @return le score
	 */
	public void askNumberOfPlayer()
	{
		
	}
}
