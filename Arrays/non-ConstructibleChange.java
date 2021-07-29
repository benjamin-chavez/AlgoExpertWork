import java.util.*;
// ATTEMPT 2 on 7/28 using dynamic programming methodology

import java.util.*;

class Program {
	// O(nlogn) Time | O(n) Space - (Note, you could optimize to O(1) Space) 
	
	// Still not totally sure how the relationship was derived, So i don't know if i could replicate this in a 
	// different problem. I was able to figure out max Amount of change, but not max amount of change I can't
	// create.
  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
		if (coins.length == 0 || coins[0] != 1) {
			return 1;
		}
		
		int[] maxChange = coins.clone();
		for (int i = 1; i < coins.length; i++) {
			int targetChange = maxChange[i - 1] + 1;
			if ( coins[i] > targetChange){
				return targetChange;
			}
			maxChange[i] = maxChange[i - 1] + coins[i];
		}

    return maxChange[coins.length - 1] + 1;
  }
}




// /////////////////////////////////////////////////

// ATTEMPT 1
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





