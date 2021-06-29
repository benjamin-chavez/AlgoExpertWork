import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] newArray = new int[array.length];
		int lowIdx = 0;
		int highIdx = array.length - 1;
		int highVal;
		int lowVal;
		
		for (int i = array.length - 1; i >= 0; i--){
			highVal = array[highIdx];
			lowVal = array[lowIdx];
			
			if(Math.abs(lowVal) > Math.abs(highVal)) {
				newArray[i] = lowVal * lowVal;
				lowIdx++;
			} else {
				newArray[i] = highVal * highVal;
				highIdx--;
			}	
		}
		return newArray;
  }
}
