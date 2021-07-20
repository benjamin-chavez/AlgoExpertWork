import java.util.*;

class Program {
	// Best: O(n) time | O(1) space
	// Average: O(n^2) time | O(1) space
	// Worst: O(n^2) time | O(1) space
  public static int[] bubbleSort(int[] array) {
		int arrayLength = array.length;
		if (arrayLength == 0) {
			return new int[] {};
		}
		
		boolean isSorted = false;
		while (!isSorted){
			isSorted = true;
			arrayLength--;
			for (int i = 0; i < arrayLength; i++) {
				if (array[i] > array[i + 1]) {
					isSorted = false;
					swap(i, i + 1, array);
				}
			}
		}
		return array;
  }
	
	public static void swap(int i, int j, int[] array) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;	
	}
}
