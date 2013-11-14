package bunco;

import java.util.Iterator;

import frameworkDice.Dice;
import frameworkDice.DiceCollection;

public class Turn extends frameworkDice.Turn
{

	public Turn(DiceCollection diceCollection)
	{
		super(diceCollection);
		// TODO Auto-generated constructor stub
	}

	public int calculateScore()
	{

		int score = 0;

		Iterator<Dice> diceIterator = diceCollection.createIterator();
		Dice dice1 = diceIterator.next();
		Dice dice2 = diceIterator.next();
		Dice dice3 = diceIterator.next();

		if (dice1.getResult() == dice2.getResult()
				&& dice1.getResult() == dice3.getResult())
		{
			if (dice1.getResult() == turnNumber)
			{
				score = 21;
			} else
			{
				score = 5;
			}
		} else
		{
			diceIterator = diceCollection.createIterator();
			while (diceIterator.hasNext())
			{
				Dice dice = diceIterator.next();
				if (dice.getResult() == turnNumber)
				{
					score++;
				}
			}
		}

		return score;
	}

	public boolean isDone()
	{
		return rollScore == 0 || rollScore == 21;
	}

	public void tellResult()
	{
		String output;
		output = Integer.toString(turnScore);

		if (turnScore == 21)
		{
			output = "Bunco!";
		}

		System.out.println("On turn " + turnNumber + ", "
				+ currentPlayer.getName() + " got a score of " + output);
	}

}
