package frameworkDice;

public class Turn
{
	private Player currentPlayer;
	private int score;
	private DiceCollection diceCollection;
	
	public Turn(DiceCollection diceCollection)
	{
		this.diceCollection = diceCollection;
		this.score = 0;
	}
	
	public void roll()
	{
		
	}
	
	public boolean isDone()
	{
		return false;
	}
	
	public void setCurrentPlayer(Player player)
	{
		
	}
}
