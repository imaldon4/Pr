/**
 * @author Ike Maldonado
 * @author Jason Schatz
 * @version 12/07/18
 */
import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
	
	private int randomValue;
	private boolean randomValueNeedsUpdating;
	private Random generator;
	
	public RandomNumberGuesser(int l, int h) {
		super(l, h);
		
		randomValueNeedsUpdating = true;
		generator = new Random();
	}
	
	public int getCurrentGuess() {
		
		if (randomValueNeedsUpdating) {
			randomValue = low + (generator.nextInt((high - low) + 1));
			randomValueNeedsUpdating = false;
		}
		
		return randomValue;
	}
	
	/**
	 * Updated throw and try-catch statements so that if user says
	 * number is higher than possible, a response is made in return.
	 */
	public void higher() {
		super.higher();
		high = getCurrentGuess() - 1;
		randomValueNeedsUpdating = true;	
	}
	/**
	 * Updated throw and try-catch statements so that if user says
	 * number is lower than possible, a response is made in return.
	 */
	public void lower() {
		super.lower();
		high = getCurrentGuess() - 1;
		randomValueNeedsUpdating = true;
	}
	
	public void reset() {
		super.reset();
		randomValueNeedsUpdating = true;
	}
	
}