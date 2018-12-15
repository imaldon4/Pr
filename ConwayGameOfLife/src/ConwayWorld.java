/**
 * This class does NOT inherit from any other class. 
 * @author Ike Maldonado
 * @version 12/14/18
 *
 */
public class ConwayWorld {
	
	/**
	 * Fields that define a FIXED number of rows and columns.
	 * Note that these are static and final, meaning that they can be
	 * accessed at any part of the package and cannot be changed. 
	 */
	static final int ROWS = 20;
	static final int COLS = 20;
	
	/**
	 * An 2D array from the AbstractCell class is made. I think that
	 * holding the objects in each cell of this 2D array works so that
	 * once the array is called to be displayed, the contents from either
	 * AlwaysAliveCell, NeverAliveCell, ConwayCell, BlinkerCell, and OwnCell 
	 * will be displayed as (dead/alive).
	 * 
	 * This is a private array, so that it is only accessible within
	 * the ConwayWorld class. 
	 */
	private AbstractCell[][] grid = new AbstractCell[ROWS][COLS]; 
	
	/**
	 * Constructor. This constructor loops through the rows and columns
	 * within grid[][] and fills the values with the number of objects
	 * created from each of the cells created by the user.
	 */
	public ConwayWorld() {
	
		for (int r = 0; r < ROWS; r++) { // Creates index for the first dimension
			for (int c = 0; c < COLS; c++) { // Creates index for the second dimension
				
				// It assigns a ConwayCell object to grid at each successive index
				// and it also passes argument values to the ConwayCell r, c
				// and it also passes on the ConwayWorld object to the ConwayCell arg.
				grid[r][c] = new ConwayCell(r, c, this);
			}
		}
	}
	
	// Display the grid
	public void display() {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				System.out.print(" " + grid[r][c].displayCharacter());		
			}
			
			System.out.println();
		}
	}
	
	// Replace a single cell
	public void replaceCell(AbstractCell cell) {
		grid[cell.getRow()][cell.getColumn()] = cell;
	}
	
	// Create the next generation
	public void advanceToNextGeneration() {
		AbstractCell[][] nextGrid = new AbstractCell[ROWS][COLS]; 

		// Build the grid for the next generation
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				nextGrid[r][c] = grid[r][c].cellForNextGeneration();
			}
		}
		
		// Out with the old, in with the new
		grid = nextGrid;
	}
	
	// Returns true if (r, c) is a valid coordinate, and the cell is alive
	public boolean isAlive(int r, int c) {
		return r >= 0 && c >= 0 && r < ROWS && c < COLS && grid[r][c].getIsAlive();
	}
}