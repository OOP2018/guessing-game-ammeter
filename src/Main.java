/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 10;
		NumberGame game = new GuessingGame(upperBound);
		GameSolver ui = new GameSolver( );
		//GuessingGame ui = new GuessungGame( );
		int solution = ui.play( game );

		System.out.println("play() returned "+solution);

	}
}
