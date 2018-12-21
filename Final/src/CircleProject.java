import java.util.ArrayList;
public class CircleProject {

	public static void main(String[] args) {
		ArrayList<MyCircle> circles = new ArrayList<MyCircle>();
		
		MyCircle c1 = new MyCircle();
		MyCircle c2 = new MyCircle();
		MyCircle c3 = new MyCircle();
		c1.setRadius(10.0);
		c2.setRadius(10.0);
		c3.setRadius(20.0);
		
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		
		System.out.println(avgCircle(circles));
	}
	
	public static double avgCircle(ArrayList<MyCircle> m) {
		double total = 0;
		int count = 0;
		
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).getRadius() > 0) {
				total += m.get(i).getRadius();
				count++;
			} else {
				m.get(i).setRadius(0);
			}
		}
		
		System.out.println(count++);
		return total / count;
		
	}
}
