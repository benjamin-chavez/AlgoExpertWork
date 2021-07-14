# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None

# O(n) time | O(1) space - where n is the number of nodes in the Linked List
def removeDuplicatesFromLinkedList(linkedList):
	# Create two pointers: curNode, nextNode
	curNode = linkedList
	nextNode = linkedList.next
	# Iterate through the linked list:
	while nextNode is not None:
		#	if the value of the curNode is equal to the value of the nextNode, chang curNode.next to the subsequent Node
		if (curNode.value == nextNode.value):
			curNode.next = nextNode.next
		else:
			curNode = curNode.next
		nextNode = nextNode.next
	# Return the modified LinkedList
	return linkedList



"""NOTE: this solution only works because python does not throw null pointer errors. See the java code for a more universal solution"""