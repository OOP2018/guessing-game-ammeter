import java.util.Random;

/**
 * Game of guessing a secret number
 * @author Pannapat Panpakdee
 */

public class GuessingGame extends NumberGame{
	/** the largest number that user can guess */
	private int upperBound;
	/** the answer of the guessing game */
	private int secret;
	/** the times that user use to guess until correct */
	private int count = 0;
	
	/**
	 * Initialize 
	 * @param upperBound is the max value for the secret number (>1)
	 */
	public GuessingGame (int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		super.setMessage("I'm thinking of a number between 1 and "+upperBound+".");
	}
	
	/**
	 * Generate a random secret number
	 * @param limit is the largest number for the generate
	 * @return a random number from the method
	 */
	private int getRandomNumber (int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	
	/**
	 * Check the number that guessed is correct or not and set a hint
	 * @param number  is the number that user guess
	 * @return true if guess a correct number
	 */
	public boolean guess (int number) {
		this.count++;
		if (number == this.secret) {
			setMessage("Correct. You used "+this.count+" guesses.\n");
			return true;
		} else if (number > this.secret) {
			setMessage("Sorry, your guess is too large.");
			return false;
		} else if (number < this.secret){
			setMessage("Sorry, your guess is too small.");
			return false;
		}
		return false;
	}
	
	/**
	 * Return the times that user guess
	 * @return the times that user guess
	 */
	public int getCount() {
		return this.count;
	}
	
	/**
	 * Return an upper bound
	 * @return the largest of the number that user can guess
	 */
	public int getUpperBound () {
		return this.upperBound;
	}
	
	/**
	 * Show the description of the game in the beginning
	 * @return the description of the game
	 */
	@Override
    public String toString() {
    	return "Guessing a Number";
    }
}
