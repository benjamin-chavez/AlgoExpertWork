// ATTEMPT 1
import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
		HashMap<Character, Integer> occuranceHash = new HashMap<Character, Integer>();
		for ( char letter : string.toCharArray()) {
			if (occuranceHash.containsKey(letter)){
				int newVal = occuranceHash.get(letter) + 1;
				occuranceHash.put(letter, newVal);
			} else {
				occuranceHash.put(letter, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> pair :  occuranceHash.entrySet()) {
			Character letter = pair.getKey();
			int numOfOccurrances = pair.getValue();
			if ( numOfOccurrances < 2) {
				String letterString = String.valueOf(letter);
				return string.indexOf(letterString);
			}
				
		}
		return -1;
	}
}
