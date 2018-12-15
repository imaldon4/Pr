/**
 * This cell alternates between on and off
 * @author Ike Maldonado
 * @version 12/15/17
 *
 */
public class BlinkerCell extends AbstractCell {
	/**
	 * Constructor.
	 * @param r
	 * @param c
	 * @param w
	 */
	public BlinkerCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}

	/**
	 * Abstract method needed in order to set the cell to 
	 * alive or dead. It calls the boolean willBeAliveInNextGeneration()
	 * method which alternates between true and false with
	 * each successive generation.
	 */
	@Override
	public AbstractCell cellForNextGeneration() {
		BlinkerCell next = new BlinkerCell(getRow(), getColumn(), world);
		next.setIsAlive(willBeAliveInNextGeneration());
		return next;
	}


	/**
	 * Returns boolean true or false for on or off.
	 */
	@Override
	public boolean willBeAliveInNextGeneration() {
		return world.Counter();
	}
}
