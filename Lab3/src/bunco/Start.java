/******************************************************
Course:  LOG121
Project: Laboratoire 3
Filename: Dice.java

@author 	Andre-Philippe Boulet, Maude Payette, Hugo Desjardins-Libero
@created	2013-11-10 Initial version
@updated	2013-11-14
 *******************************************************/

package bunco;

//import java.util.Scanner;

public class Start
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BuncoGame newGame = new BuncoGame();
		newGame.initialize();
		startGame(newGame);				
	}

	/**
	 * Will start a game that was instanciated elsewhere.
	 * 
	 * @author	Andre-Philippe Boulet
	 * @param	game	The game to play
	 * 
	 */
	static public void startGame(BuncoGame game)
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
