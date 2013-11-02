/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Game.java

@author 	André-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
 *******************************************************/


package frameworkDice;



public class Game
{
	private int numberOfTurn;
	private DiceCollection diceCollection;
	private PlayerCollection playerCollection;
	
	
	/**
	 * Call subclass to find the total score for this turn.
	 * @author: 
	 * @param 	leDepuisFile   File de la pièce à déplacer
	 * @return 	A score integer
	 */
	public int calculateTurnScore() 
	{
		return 0;
	}
	
	
	/**
	 * Call subclass to find the total score for this turn.
	 * @author: 
	 * @param 	leDepuisFile   File de la pièce à déplacer
	 * @return 	The player who won
	 */
	public Player calculateWinner() 
	{
		return null;
	}
	
	public void initialize() {

		// GetDices : DiceCollection
		
		// GetNumberOfTurn

		// AskPlayerInformation
	}
	
	
	
	public void play() {
		
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
	 * @author: 
	 * @param leDepuisFile   File de la pièce à déplacer
	 * @return le score
	 */
	public void askNumberOfPlayer() 
	{

	}
}
