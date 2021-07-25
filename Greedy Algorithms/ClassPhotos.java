// Solution 2: a bit more similar to the algo expert solution:
import java.util.*;

// O(nlogn) Time | O(1) space - where n is the number of students
class Program {
  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		
		boolean redIsTall = redShirtHeights.get(0) > blueShirtHeights.get(0) ? true : false;
		
		for (int idx = 0; idx < redShirtHeights.size(); idx++) {
			if ( redIsTall) {
				if (redShirtHeights.get(idx) <= blueShirtHeights.get(idx))
					return false;
			} else {
				if (blueShirtHeights.get(idx) <= redShirtHeights.get(idx))
					return false;
				}
		}
		
		return true;
  }
}




// Solution 1: My more intuitive solution
// import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		ArrayList<Integer> tallRow;
		ArrayList<Integer> shortRow;
			
		if (redShirtHeights.get(0) > blueShirtHeights.get(0)) {
			tallRow = redShirtHeights;
			shortRow = blueShirtHeights;
		}
		else {
			shortRow = redShirtHeights;
			tallRow = blueShirtHeights;
		}
		
		for (int idx = 0; idx < redShirtHeights.size(); idx++) {
			if (shortRow.get(idx) >= tallRow.get(idx))
				return false;
		}
		
		return true;
  }
}

