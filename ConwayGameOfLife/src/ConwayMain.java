import java.util.*;

public class ConwayMain {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ConwayWorld world = new ConwayWorld();
		
		// Add some live Conway cells, in a horizontal line		
		for (int i = 0; i < 6; i++) {
			ConwayCell c = new ConwayCell(5, 5 + i, world);
			c.setIsAlive(true);
			world.replaceCell(c);
		}
		
//		// Add an always-alive cells 
//		AbstractCell a = new AlwaysAliveCell(12, 12, world);
//		world.replaceCell(a);
//			
//		// Add an Never-alive cells
//		AbstractCell n = new NeverAliveCell(17, 17, world);
//		world.replaceCell(n);
//		
//		// Add a blinker cell
//		AbstractCell b = new BlinkerCell(9, 3, world);
//		world.replaceCell(b);
		
		// Add OwnCell
		AbstractCell o = new OwnCell(5,5, world);
		world.replaceCell(o);
			
		// Go!	
		do {
			world.display();
			world.advanceToNextGeneration();
			
			System.out.print("Another? (y/n): ");
		} while (input.nextLine().charAt(0) == 'y');

	}
}

