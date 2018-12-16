/**
 * This method is meant to create a cell if there is at least
 * one existing cell neighbor.
 * @author Ike Maldonado
 * @version 12/15/18
 *
 */
public class OwnCell extends AbstractCell {

	public OwnCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	
	/**
	 * This method uses the ConwayCell neighborCount() method
	 * and returns a value of true if the cell is alive.
	 */
	@Override
	public boolean willBeAliveInNextGeneration() {
		ConwayCell conCell = new ConwayCell(getRow(), getColumn(), this.world);
		int nc = conCell.neighborCount();
		
		if (getIsAlive()) {
			return nc >= 1;
		} else {
			return false;
		}
	}

	
	/**
	 * This method uses willBeAliveInNextGeneration() in order to 
	 * create a cell that is positive for any cell with >= 1 neighbor.
	 */
	@Override
	public AbstractCell cellForNextGeneration() {
		OwnCell oc = new OwnCell(getRow(), getColumn(), this.world);
		oc.setIsAlive(willBeAliveInNextGeneration());
		return oc;
	}

}