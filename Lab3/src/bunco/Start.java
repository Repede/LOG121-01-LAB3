package bunco;

public class Start
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		startGame();
	}

	static public void startGame()
	{
		Game newGame = GameFactory.createGame();
		startGame(newGame);
	}

	static public void startGame(Game newGame)
	{

		System.out.println("A new game is stating !");
		newGame.play();

		// System.out.println("Do you want to play again ?");
	}

}
