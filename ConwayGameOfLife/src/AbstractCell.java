/**
 * All cells inherit from the AbstractCell superclass.
 * From the text: An abstract class is not instantiated
 * but other classes extend it. An abstract method has
 * no body and must be overriden in a subclass. Remember
 * that abstract classes so that other classes inheriting
 * must utilize the abstract methods provided.
 * 
 * @author Ike Maldonado
 * @version 12/14/18
 *
 */
public abstract class AbstractCell {
	/**
	 * Fields defined.
	 */
	private boolean isAlive; // Checks to see if cell is alive or dead
	private int row; 	// Holds number of rows for cell?
	private int column;	// Holds number of columns for cell?

	protected ConwayWorld world;	// Holds a ConwayWorld class object.
	
	/**
	 * Constructor. 
	 * @param r Holds the row parameter 
	 * @param c Holds the column parameters
	 * @param w Holds the ConwayWorld object 
	 */
	public AbstractCell(int r, int c, ConwayWorld w) {
		row = r;
		column = c;
		world = w;
		isAlive = false; // Automatically set to dead
	}
	
	/**
	 * A helper method that defines what the cell
	 * looks like when it is alive or dead. A simplified
	 * version of the if statement is provided.
	 * @return
	 */
	public char displayCharacter() {
		return isAlive ? '■' : '∙';
	}
	
	/**
	 * A mutator method that can set a cell value via isAlive
	 * value to either alive or dead. 
	 * @param value
	 */
	public void setIsAlive(boolean value) {
		isAlive = value;
	} 
	
	/**
	 * A helper method to get the boolean value
	 * for whether the cell is alive or dead.
	 * @return 
	 */
	public boolean getIsAlive() {
		return isAlive;
	}
	
	/**
	 * A helper method to retrieve the row number
	 * of the cell.
	 * @return
	 */
	public int getRow() {
		return row;
	}
	
	/**
	 * A helper method to get the column number
	 * of the cell.
	 * @return
	 */
	public int getColumn() {
		return column;
	}
	
	/**
	 * Requires the user to implement and override these 
	 * two abstract methods. The first defines the next generation 
	 * cell, the second will be a boolean to see if it will
	 * be alive in the next generation.
	 * @return
	 */
	public abstract AbstractCell cellForNextGeneration();
	public abstract boolean willBeAliveInNextGeneration();
}