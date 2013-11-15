package bunco;

import java.util.Scanner;
//import java.util.Stack;

import frameworkDice.Player;

public class GameFactory
{

	// Stack<Game> gameCollection;

	static public Game createGame()
	{

		int numberOfPlayer = 0;

		Game newGame = new Game();

		// Ask and create the players
		System.out.print("Please enter a number of player : ");
		Scanner s = new Scanner(System.in);
		numberOfPlayer = s.nextInt();
		for (int i = 0; i < numberOfPlayer; i++)
		{

			System.out.print("Please player " + (i + 1) + " name : ");
			s = new Scanner(System.in);

			Player newPlayer = new Player(s.next());
			newGame.addPlayer(newPlayer);
		}

		if (s != null)
			s.close();

		return newGame;
	}

}
