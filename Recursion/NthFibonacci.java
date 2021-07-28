import java.util.*;

// SOLUTION 3: Iterative Approach for better space complexity
class Program {
	// O(n) time | O(1) space   
	public static int getNthFib(int n) {
		int[] last2Fib = {0, 1};
		
		for (int counter = 3; counter <= n; counter++) {
			int curFib = last2Fib[0] + last2Fib[1];
			last2Fib[0] = last2Fib[1];
			last2Fib[1] = curFib;
		}
	
		return n > 1 ? last2Fib[1] : last2Fib[0];
  }
}




// SOlULTION 2:
class Program {
	// O(n) Time | O(n) Space - Where n is the number of integers
	public static int getNthFib(int n) {
		Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
		memoize.put(1, 0);
		memoize.put(2, 1);
		return getNthFib(n, memoize);
  }
	
	public static int getNthFib(int n, Map<Integer, Integer> memoize) {
		if (!memoize.containsKey(n)) {
			int curFib = getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize);
			memoize.put(n, curFib);
		} 	
		return memoize.get(n);
	}
}





// SOlULTION 1:

// O(2^n) Time | O(n) Space - Where n is the number of integers
class Program {
  public static int getNthFib(int n) {
		if ( n == 1 )
			return 0;
		if ( n == 2 )
			return 1;
		
		return getNthFib(n-1) + getNthFib(n-2);
  }
}
