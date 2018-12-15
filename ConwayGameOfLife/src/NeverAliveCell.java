/**
 * Inherits from the AbstractCell abstract superclass.
 * @author Ike Maldonado
 * @version 12/14/18
 *
 */
public class NeverAliveCell extends AbstractCell {
	
	/**
	 * Constructor. 
	 * @param r
	 * @param c
	 * @param w
	 */
	public NeverAliveCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	/**
	 * Returns an AbstractCell class object
	 */
	public AbstractCell cellForNextGeneration() {
		return this;
	}
	
	/**
	 * Why is this not overriden? Note will always return true.
	 */
	public boolean willBeAliveInNextGeneration() {
		return false;
	}

	/**
	 * This returns a 'X' character
	 */
	public char displayCharacter() {
		return 'X';
	}
	
	/**
	 * This returns a boolean value always false or dead.
	 */
	public boolean getIsAlive() {
		return false;
	}
}