import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		// Solutions from video explanations
		// Solution 1:
			// O(n) time | O(1) Space
			// int arrIdx = 0;
			// int seqIdx = 0;
			// while (arrIdx < array.size() && seqIdx < sequence.size()) {
			// 	if( array.get(arrIdx) == sequence.get(seqIdx) )
			// 		seqIdx++;
			// 	arrIdx++;
			// }
			// return seqIdx == sequence.size();
			
		// Solution 2:
			// O(n) time | O(1) Space
		int seqIdx = 0;
		for (var value : array) {
			if (seqIdx == sequence.size()){
				// break;
				return true;
			}
			if (value == sequence.get(seqIdx))
				seqIdx++;
		}
		return seqIdx == sequence.size();
	}
}
