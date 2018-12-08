/**
 * 
 * @author Ike Maldonado
 * @author Jason Schatz
 * @version 12/07/18
 *
 */
public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	/**
	 * Updated throw and try-catch statements so that if user says
	 * number is higher than possible, a response is made in return.
	 */
	public void higher() {
		//try it now not working
		try { 
			low = getCurrentGuess() + 1;
			if (low == high+1) {
				throw new IllegalStateException("Error: Invalid response.");
			}
		}
		catch (IllegalStateException e) {
			System.out.println("That's impossible! There's nothing higher than " + high);
		}
	}
	/**
	 * Updated throw and try-catch statements so that if user says
	 * number is lower than possible, a response is made in return.
	 */
	public void lower() {
		try {
			high = getCurrentGuess() - 1;
			if (low == high+1) {
				throw new IllegalStateException("Error: Invalid response.");
			}
		}
		catch (IllegalStateException e) {
			System.out.println("That's impossible! There's nothing lower than " + low);
		}
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}