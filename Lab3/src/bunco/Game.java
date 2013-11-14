package bunco;

import frameworkDice.Dice;
import frameworkDice.Player;

public class Game extends frameworkDice.Game
{

	public Game(int numOfTurn, int numOfDice)
	{
		super(numOfTurn, numOfDice);
		// TODO Auto-generated constructor stub
	}

	public void addDice(int numberOfFaces)
	{
		Dice newDice = new Dice(numberOfFaces);
		diceCollection.addDice(newDice);
	}

	public void addTurn()
	{

		Turn newTurn = new Turn(this.diceCollection);
		turnCollection.addTurn(newTurn);
	}

	public void addPlayer(Player newPlayer)
	{
		playerCollection.addPlayer(newPlayer);
	}
}
