/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Game.java

@author 	Andr�-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
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
	 * @param 	leDepuisFile   File de la pi�ce � d�placer
	 * @return 	A score integer
	 */
	public int calculateTurnScore() 
	{
		return 0;
	}
	
	
	/**
	 * Call subclass to find the total score for this turn.
	 * @author: 
	 * @param 	leDepuisFile   File de la pi�ce � d�placer
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
	 * @param leDepuisFile   File de la pi�ce � d�placer
	 * @return le score
	 */
	public void askNumberOfPlayer() 
	{

	}
}
