/**
 * This class extends the AbstractCell abstract superclass.
 * @author Ike Maldonado
 * @version 12/14/18
 *
 */
public class ConwayCell extends AbstractCell {

	/**
	 * Constructor. It obtains the values from the ConwayWorld class
	 * and fills out the values for r,c, and ConwayWorld object into
	 * the holder values by creating AbstractCell objects. 
	 * @param r
	 * @param c
	 * @param w
	 */
	public ConwayCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}	

	/**
	 * Why no override statement?
	 * 
	 * This method 
	 */
	public boolean willBeAliveInNextGeneration() {
		int nc = neighborCount();
		
		if (getIsAlive()) {
			return nc == 2 || nc == 3;
		} else {
			return nc == 3;
		}
	}
	
	public AbstractCell cellForNextGeneration() {
		ConwayCell next = new ConwayCell(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
	
	/**
	 * This method creates an efficient way of establishing the rules
	 * behind the game by counting the number of neighbors next
	 * to each cell.
	 * @return Returns the number of neighbors on the cell.
	 */
	public int neighborCount() {
		int count = 0;	// Set counter to zero
		
		int row = getRow(); // Retrieves the AbstractCell row integer.
		int column = getColumn(); // Retireves the AbstractCell column integer.
		
		/*
		 * What does dr stand for? Directly Reaching?
		 */
		for (int dr = -1; dr <= 1; dr++) { // Loops through -1 0 1
			for (int dc = -1; dc <= 1; dc++) { // Loops through -1 0 1
				
				/*
				 * Test statement: In the ConwayWorld object, if ConwayWorld object 
				 * If the row number 5+-1, 5-1
				 */
				if (world.isAlive(row + dr, column + dc) && !(dr == 0 && dc == 0)) {
					count++;
				}
			}
		}
		
		return count;
	}
}