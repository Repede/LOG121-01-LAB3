package bunco;

import java.util.Scanner;

public class Start
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Game newGame = new Game();
		newGame.initialize();
		startGame(newGame);				
	}

	static public void startGame(Game game)
	{		
		System.out.println("A new game is starting !");
		game.play();		
		
		
		/*System.out.print("So fun! Do you want to play again ? Answer with 1 or 0.");		
		
		Scanner s = new Scanner(System.in);		
		String answer = s.next();
		if( answer.endsWith("1") ) {
			Game newGame = new Game();
			newGame.initialize(game);
			startGame(newGame);
		}
		if (s != null) s.close();*/
	}
}
