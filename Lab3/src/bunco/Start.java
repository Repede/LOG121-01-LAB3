package bunco;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Game newGame = GameFactory.createGame();		
		

		System.out.println("The game is stating !");
		newGame.play();
		
		System.out.println("The game has ended.");
	}

}
