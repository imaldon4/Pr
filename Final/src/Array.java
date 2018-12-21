public class Array {
	public static void main(String[] args) {
		int[] array = {4,5,2,4,8,67,45,9,0,23,4,5,1,2,5,65,7,67,9,0,6,5};
		int[] newArray = arrayMethod(array);
		
		System.out.println("New Array");
		for(int i: newArray) {
			System.out.println(i);
		}
		
		System.out.println("Old Array");
		for(int i: array) {
			System.out.println(i);
		}
	}
	public static int[] arrayMethod(int[] array) {
		if(array.length <= 0) {
			throw new IllegalArgumentException(
					"The array must not be empty!");
		}
		int[] newArray = new int[array.length];
		for (int i = 1; i < array.length; i++) {
		newArray[i] = array[i];	
		}
		newArray[0] = 0;
		newArray[array.length -1] = 0;
		return newArray;
	}
}
