import java.util.*;

class Program {
	// O(log(n)) time || O(1) space
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
		// create lo, high, and mid variables
		// While lo <= high run the following algo:
			// SET MID??
			// if target > mid, then set lo equal to mid + 1. 
			// if target < mid, then set hi equalt to mid - 1
			// if target equals value at mid index, return mid index
		int lo = 0;
		int hi = array.length - 1; 
		
		
		while ( lo <= hi ) {
			int mid = lo + (( hi - lo ) / 2);
			if (target > array[mid] ) {
				lo = mid + 1;
			} else if ( target < array[mid] ) {
				hi = mid - 1;
			} else if (target == array[mid] ) {
				return mid;
			}
		}
    return -1;
  }
}
