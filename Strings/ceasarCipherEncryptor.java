import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Time Complexity: O(n)  | Space Complexity: O(n)
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder shiftedStr = new StringBuilder();
		System.out.println(str.length());
		while (key > 26) {
			key -= 26;
		}
		
		for (int idx = 0; idx < str.length(); idx++){
			int letterIdx = alphabet.indexOf(str.charAt(idx)) + key;
			letterIdx = (letterIdx >= 26) ? letterIdx - 26 : letterIdx;
			shiftedStr.append(alphabet.charAt(letterIdx ));
		}
    return shiftedStr.toString();
  }
}
