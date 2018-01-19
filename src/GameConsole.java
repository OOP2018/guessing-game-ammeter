import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(PannapatGame game) {
		Scanner console = new Scanner(System.in);

		System.out.println( game.toString() );
		
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		int guess = console.nextInt();
		boolean correct = game.guess(guess);
		while (!correct) {
			System.out.println( game.getMessage() );
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
		}
		
		System.out.println( game.getMessage() );
		return guess;
		
	}
	
}
