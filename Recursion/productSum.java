// Product Sum
import java.util.*;

class Program {
	// O(n) time | O(d) - where n is the total number of elements in the array,
	// including sub-elements, and d is the greatest depthe of "special" arrays in the array
	
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
		int depth = 0;
		return productSumHelper(array, depth + 1);
  }
	
	public static int productSumHelper(List<Object> array, int depth) {
		int curSum = 0;
		for (Object element : array){
			if(element instanceof ArrayList) {						// if cur val is a list
				@SuppressWarnings("unchecked")
				ArrayList<Object> elementAsList = (ArrayList<Object>) element;
				curSum += productSumHelper(elementAsList, depth + 1);
			} else {																			// if cur val is an int	
				curSum += (int) element;
			}
		}
		return curSum * depth;
	}
}



// // Solution 1
// import java.util.*;

// class Program {
//   // Tip: You can use `element instanceof ArrayList` to check whether an item
//   // is an array or an integer.
//   public static int productSum(List<Object> array) {
// 		int depth = 0;
// 		return productSum(array, depth + 1);
//   }
	
// 	public static int productSum(List<Object> array, int depth) {
// 		int curSum = 0;
// 		for (int i = 0; i < array.size(); i++) {
// 			if(array.get(i) instanceof ArrayList) {
// 				@SuppressWarnings("unchecked")
// 				ArrayList<Object> elementAsList = (ArrayList<Object>) array.get(i);
// 				curSum += productSum(elementAsList, depth + 1);
// 			} else {
// 				curSum += (int) array.get(i);
// 			}
// 		}
// 		return curSum * depth;
// 	}
// }
