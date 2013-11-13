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
			if(curPlayer.getScore() >= winscore)
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
		int turnNumber = 0;
		while( turnsIterator.hasNext() ) {
			
			Turn currentTurn = turnsIterator.next();
			currentTurn.setTurnNumber(++turnNumber);
			
			PlayerIterator playersIterator = playerCollection.createIterator();
			while( playersIterator.hasNext() ) {
								
				
				Player currentPlayer = playersIterator.next();				
				currentTurn.setCurrentPlayer(currentPlayer);				
				
				do {
					currentTurn.roll();
				} while (!currentTurn.isDone());	
				
				
				currentTurn.tellResult();			
			}
		}

		
		System.out.println("All turns have been played.");

		PlayerIterator playersIterator = playerCollection.createIterator();
		while(playersIterator.hasNext()) {
			Player player = playersIterator.next();
			System.out.println(player.getName() + " got " +player.getScore()+ " points");
		}
		
		Player winner = calculateWinner();
		if(winner != null) {
			System.out.println("The game has been won by " + winner.getName());
		}
		else {
			System.out.println("The game is a draw !");
		}
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
