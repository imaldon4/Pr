
public class AdvancedDiceHolder extends DiceHolder{

	AdvancedDiceHolder(int[] values){
		super(values[0], values[1],values[2],values[3],values[4]);
	}
		
	public int[] largestSet() {
		int[] newArray = new int[5];
		int count = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] == v[i+1]) {
				newArray[count] = v[i];
				count++;
			}
		}
		return newArray;
	}
		

		// Returns an array that holds the values that comes up most often.

		// For the following array: [5, 3, 5, 5, 6], return [5, 5, 5]

		// For the following array: [2, 3, 5, 5, 2], return [5, 5] or [2, 2] (either is correct)

		// For the following array: [2, 3, 4, 5, 1], return [1], [2], [3], [4], or [5]. They all tie.
}
