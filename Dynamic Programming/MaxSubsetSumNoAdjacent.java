import java.util.*;


// SOLUTION 2: With Space optimization
class Program {
	// O(n) Time | O(1) Space
  public static int maxSubsetSumNoAdjacent(int[] array) {
		if(array.length == 0)
			return 0;
		else if (array.length ==1)
			return array[0];
		
		int iMin2 = array[0];
		int iMin1 = Math.max(array[0], array[1]);
			
		for (int i = 2; i < array.length; i++) {
			int tmp = Math.max(iMin1, iMin2 + array[i]);
			iMin2 = iMin1;
			iMin1 = tmp;
		}
		return iMin1;
  }
}



// SOLUTION 1
class Program {
	// O(n) Time | O(n) space
  public static int maxSubsetSumNoAdjacent(int[] array) {
    int n = array.length;
		if ( n == 0)
			return 0;
		if (n == 1)
			return array[0];
		
		int[] dp = new int[n];
		dp[0] = array[0];
		dp[1] = Math.max(dp[0], array[1]);
		
		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + array[i]);
		}
    return dp[n-1];
  }
}
