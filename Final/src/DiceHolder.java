
public class DiceHolder {

	public int[] v;
	
	public DiceHolder(int value1, int value2, int value3, int value4, int value5) {
		v[0]=value1;
		v[1]=value2;
		v[2]=value3;
		v[3]=value4;
		v[4]=value5;
	}


	public int getValue(int index) {
		return v[index];
	}

	public void setValue(int index, int value) {
		v[index] = value;
	}


	public int getTotal() {
		int total = 0;
		for (int i = 0; i < v.length; i++) {
			total =+ v[i];
		}
		// Returns the total of the five values
		return total;
	}
}
