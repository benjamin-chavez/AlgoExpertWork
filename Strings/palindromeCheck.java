import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		int lenOfStr = str.length();
		for (int idx = 0; idx < lenOfStr; idx++){
			char front = str.charAt(idx);
			char back = str.charAt((lenOfStr - 1) - idx);
			if ( front != back)
				return false;
		}
    return true;
  }
}

