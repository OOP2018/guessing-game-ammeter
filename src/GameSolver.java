
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution.
	 * @param game is the NumberGame to solve
	 * @return number is the number that program guess
	 */
	public int play (NumberGame game) {
		int min = 1;
		int max = game.getUpperBound();
		
		int number = min + (max - min)/2;
		int newBound = number;

		while (!game.guess(number)) {
			if (game.getMessage().contains("too large")) {
				max = number - 1;
				number  = min + (max - min)/2;
			} else if (game.getMessage().contains("too small")) {
				min = number + 1;
				number = min + (max - min)/2;
			}
		}
		
		return number;
	}
}
