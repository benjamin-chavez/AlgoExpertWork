import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
		Arrays.sort(coins);
		int maxChange = 0;
		for ( int idx = 0; idx < coins.length; idx++){
			int curChange = maxChange + 1;
			if (coins[idx] > curChange) {
				return curChange;
			} 
			maxChange += coins[idx];
		}
		
    return maxChange + 1;
  }
}
