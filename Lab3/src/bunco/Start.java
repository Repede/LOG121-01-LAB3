package bunco;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game newGame = GameFactory.createGame();
		
		

		System.out.println("La partie d�marre !");
		newGame.play();
		
		System.out.println("La partie est termin�.");
	}

}
