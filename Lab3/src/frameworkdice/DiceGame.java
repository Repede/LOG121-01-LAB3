/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Game.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-01 Initial version
@updated	2013-11-12
 *******************************************************/

package frameworkdice;

import java.util.Scanner;

public class DiceGame implements IStrategyGame
{
	protected int numberOfTurn;
	protected TurnCollection turnCollection;
	protected DiceCollection diceCollection;
	protected PlayerCollection playerCollection;

	public DiceGame()
	{
		turnCollection = new TurnCollection();
		diceCollection = new DiceCollection();
		playerCollection = new PlayerCollection();
	}
	
	/**
	 * Initializes the game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initialize() {
		initializePlayers();
		initializeDices();
		initializeTurns();
	}
	
	/**
	 * Initializes the game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializePlayers() {
		
		// Get number of player and add them to the collection
		System.out.print("Please enter a number of player : ");
		Scanner scan = new Scanner(System.in);		
		int numberOfPlayer = scan.nextInt();
		
		
		for (int i = 0; i < numberOfPlayer; i++)
		{
			System.out.print("Please player " + (i + 1) + " name : ");
			scan = new Scanner(System.in);

			Player newPlayer = new Player(scan.next());
			playerCollection.addPlayer(newPlayer);
		}
		scan.close();
	};
	
	/**
	 * Initializes the game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeDices() {}
	
	/**
	 * Adds a player to the game
	 * 
	 * @author: Hugo Delibero
	 * @param: player The player to add
	 */
	public void addPlayer(Player player)
	{
		playerCollection.addPlayer(player);
	}
	
	/**
	 * Initializes the turns
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initializeTurns() {}
	
	
	
	
	/**
	 * Initializes the game from an existing game
	 * 
	 * @author: Andre-Philippe Boulet
	 * 
	 */
	public void initialize(DiceGame fromGame) {
		this.turnCollection = fromGame.turnCollection;
		this.diceCollection = fromGame.diceCollection;
		this.playerCollection = fromGame.playerCollection;
	}
	

	/**
	 * Call subclass to find the total score for this turn.
	 * 
	 * @author: Hugo Desjardins-Libero, Andre-Philippe Boulet
	 * 
	 * @return The player who won
	 */
	public Player calculateWinner()
	{
		Player winner = null;
		int winscore = 0;
		PlayerIterator iter = playerCollection.createIterator();
		while (iter.hasNext())
		{
			Player curPlayer = iter.next();
			if (curPlayer.getScore() >= winscore)
			{
				winscore = curPlayer.getScore();
				winner = curPlayer;

			}
		}
		return winner;
	}	

	
	
	/**
	 * Plays the game
	 * 
	 * @author: Hugo Desjardins-Libero, Andre-Philippe Boulet
	 * 
	 */
	public void play()
	{

		TurnIterator turnsIterator = turnCollection.createIterator();
		int turnNumber = 0;
		while (turnsIterator.hasNext())
		{
			GameTurn currentTurn = turnsIterator.next();
			currentTurn.setTurnNumber(++turnNumber);

			PlayerIterator playersIterator = playerCollection.createIterator();
			while (playersIterator.hasNext())
			{

				Player currentPlayer = playersIterator.next();
				currentTurn.setCurrentPlayer(currentPlayer);

				do
				{
					currentTurn.roll();
				} while (!currentTurn.isDone());

				currentTurn.tellResult();
			}
		}

		System.out.println("All turns have been played.");		
		displayScore();
	}
	
	/**
	 * Call class to display the score and the winner of the game.
	 * 
	 * @author: Maude
	 */
	public void displayScore() {
		
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
			System.out.println("The game is a draw!");
		}
	}
}
