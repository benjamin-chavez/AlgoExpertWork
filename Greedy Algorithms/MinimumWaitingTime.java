// Solution 2: The apprach used in the Algo Solution:
import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    Arrays.sort(queries);
		int curWaitTime = 0;
		int totalWaitTime = 0;
		for (int idx = 1; idx < queries.length; idx++) {
			curWaitTime += queries[idx-1];
			totalWaitTime += curWaitTime;
		}
    return totalWaitTime;
  }
}



// Solution 1: My intuitive solution
import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    Arrays.sort(queries);
		int curWaitTime = 0;
		int totalWaitTime = 0;
		for (int idx = 1; idx < queries.length; idx++) {
			curWaitTime += queries[idx-1];
			totalWaitTime += curWaitTime;
		}
		
			
		
    return totalWaitTime;
  }
}
