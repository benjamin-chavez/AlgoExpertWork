import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
		char charactersArray[] = characters.toCharArray();
		char documentArray[] = document.toCharArray();
		
		Arrays.sort(charactersArray);
		Arrays.sort(documentArray);

		for ( int i = 0, j = 0; i < charactersArray.length && j < documentArray.length; i++){
			if ( charactersArray[i] == documentArray[j])
				j++;
			else if (charactersArray[i] > documentArray[j])
				return false;
			else if (charactersArray[i] != documentArray[j] && i == charactersArray.length - 1)
				return false;
		}
		
    return true;
  }
}

