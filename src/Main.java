/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 3;
		NumberGame game = new PannapatGame(upperBound);
		GameSolver ui = new GameSolver( );
		//GameConsole ui = new GameConsole( );
		int solution = ui.play( game );

		System.out.println("play() returned "+solution);

	}
}
