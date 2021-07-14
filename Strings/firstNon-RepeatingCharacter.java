// Attempt 2:
import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
		// Create an empty HashMap
		HashMap<Character, Integer> lettersHash = new HashMap<Character, Integer>();
		
		// Iterate through each character in the string, adding or incrementing to the hashmap
		for (int idx = 0; idx < string.length(); idx++) {
			char key = string.charAt(idx);
			lettersHash.put(key, lettersHash.getOrDefault(key, 0) + 1);
		}
		
		// Iterate through each character in the string again. Keep track of the index and
		// 		check the value of each character in the hashmap. If the value equals 1, return the index
		for (int idx = 0; idx < string.length(); idx++) {
			char key = string.charAt(idx);
			if (lettersHash.get(key) == 1)
				return idx;
		}
		
		// If no value equals 1, then return -1
    return -1;
  }
}




// ATTEMPT 1
// import java.util.*;

// class Program {

//   public int firstNonRepeatingCharacter(String string) {
//     // Write your code here.
// 		HashMap<Character, Integer> occuranceHash = new HashMap<Character, Integer>();
// 		for ( char letter : string.toCharArray()) {
// 			if (occuranceHash.containsKey(letter)){
// 				int newVal = occuranceHash.get(letter) + 1;
// 				occuranceHash.put(letter, newVal);
// 			} else {
// 				occuranceHash.put(letter, 1);
// 			}
// 		}
		
// 		for (Map.Entry<Character, Integer> pair :  occuranceHash.entrySet()) {
// 			Character letter = pair.getKey();
// 			int numOfOccurrances = pair.getValue();
// 			if ( numOfOccurrances < 2) {
// 				String letterString = String.valueOf(letter);
// 				return string.indexOf(letterString);
// 			}
				
// 		}
// 		return -1;
// 	}
// }
