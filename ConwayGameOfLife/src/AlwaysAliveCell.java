/**
 * This class is for cells that have at least
 * ____ # of neighbors, they remain alive.
 * @author Ike Maldonado
 * @version 12/14/18
 */
public class AlwaysAliveCell extends AbstractCell {
	
	/**
	 * Constructor that receives parameter input and passes
	 * the values to AbstractCell abstract superclass.
	 * @param r The number of rows for the cell? Or the row number?
	 * @param c The number of columns for the cell? Or the column number?
	 * @param w The ConwayWorld object
	 */
	public AlwaysAliveCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	/**
	 * Returns an AbstractCell type
	 */
	public  AbstractCell cellForNextGeneration() {
		return this;
	}
	
	/**
	 * Why is this not Overridden? Notice that it will always
	 * be true.
	 */
	public boolean willBeAliveInNextGeneration() {
		return true;
	}
	
	/**
	 * Will always return true.
	 */
	public boolean getIsAlive() {
		return true;
	}
	
	/**
	 * This returns the character '+' when requested.
	 */
	public char displayCharacter() {
		return '■';
	}
}