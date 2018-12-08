/**
 * Updated program using Exceptions
 * @author Ike Maldonado k
 * @author Jason Schatz
 * @version 12/07/18
 *
 */
public class GridWriterProgram {
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);	
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyRectangle(40, 0, 10, 10));
		GridItem i = gw.get(2); //this causes out of bounds exception
	    System.out.println(i.getArea());
	}
}