package frameworkDice;


public class Turn
{
	protected Player currentPlayer;
	protected DiceCollection diceCollection;
	protected int rollScore;
	protected int turnScore;
	protected int turnNumber;
	
	public Turn(DiceCollection diceCollection)
	{
		this.diceCollection = diceCollection;
		this.rollScore = 0;
	}
	
	public void roll()
	{
		rollScore = 0;
		
		DiceIterator iter = diceCollection.createIterator();
		while(iter.hasNext())
		{
			iter.next().roll();
		}
		
		
		rollScore = calculateScore();
		turnScore += rollScore;
		currentPlayer.addScore(rollScore);
	}
	
	public int calculateScore() {
		return 0;
	}
	
	public boolean isDone()
	{
		return true;
	}
	
	public void setCurrentPlayer(Player player)
	{
		currentPlayer = player;
		turnScore = 0;
	}
	
	
	/**
	 * Set the current turn number
	 * 
	 * @author: Andre-P. Boulet
	 * @param  number	The current turn number	 * 
	 */
	public void setTurnNumber(int number) {
		turnNumber = number;
	}
	
	public void tellResult() {
		System.out.println("On turn "+turnNumber+", "+currentPlayer.getName()+" got a score of "+turnScore);
	}
}
