import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
		// Create Variables
		int maxChange = 0;
		// Sort coins array
		Arrays.sort(coins);
		
		// Iteratate through coin array
		// Test: If max amount of change +1 is less than or equal to cur number add cur number to max change
		//					else, return max + 1
		for ( int coin : coins) {
			// System.out.println(coin);
			if ( coin > maxChange + 1){
				return maxChange + 1;
			}
			
			maxChange += coin;
		}
		
    return maxChange + 1;
  }
}
