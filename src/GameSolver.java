
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution.
	 * @param game is the NumberGame to solve
	 * @return number is the number that we guess
	 */
	public int play (NumberGame game) {
		System.out.println( game.toString() );
		
		int number = game.getUpperBound()/2;
		int newBound = number;
		boolean correct = game.guess(number);
		int count = 2;
		System.out.print("Your answer? ");
		System.out.println(number);
		game.guess(number);

		while (!correct) {
			System.out.println( game.getMessage() );
			System.out.print("Your answer? ");
			if (game.getMessage().contains("too large")) {
				number = number - (newBound/count);
				System.out.println(number);
				correct = game.guess(number);
			} else if (game.getMessage().contains("too small")) {
				number = number + (newBound/count);
				System.out.println(number);
				correct = game.guess(number);
			}
			if (newBound/count > 1) {
				count = count*2;
			}
		}
		
		return number;
	}
}
