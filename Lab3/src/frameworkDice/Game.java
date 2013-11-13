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
	protected int numberOfTurn;
	protected TurnCollection turnCollection;
	protected DiceCollection diceCollection;
	protected PlayerCollection playerCollection;

	public Game(int numOfTurn, int numOfDice)
	{
		turnCollection  = new TurnCollection();
		diceCollection  = new DiceCollection();
		playerCollection  = new PlayerCollection();
		
		for(int i=0; i<numOfTurn; i++) {
			this.addTurn();
		}
		
		for(int i=0; i<numOfDice; i++) {
			this.addDice(6);
		}		
	}
	
	public void addDice(int numberOfFaces) {
			
	}
	
	public void addTurn() {
		
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
		
		TurnIterator turnsIterator = turnCollection.createIterator();
		while( turnsIterator.hasNext() ) {
			
			Turn currentTurn = turnsIterator.next();
			
			PlayerIterator playersIterator = playerCollection.createIterator();
			while( playersIterator.hasNext() ) {
				
				currentTurn.setCurrentPlayer(playersIterator.next());
				
				currentTurn.roll();
				System.out.println("Rolled...");
				
			}
		}
		
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
		//
	}
}
