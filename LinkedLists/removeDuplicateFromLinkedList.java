import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
		LinkedList curNode = linkedList;
		// LinkedList nextNode = linkedList.next;
		
		while ( curNode != null) {
			LinkedList nextNode = curNode.next;
			while ( nextNode != null && curNode.value == nextNode.value) {
					nextNode = nextNode.next;	
			}		
			
			curNode.next = nextNode;
			curNode = nextNode;
		}

    return linkedList;
  }
}