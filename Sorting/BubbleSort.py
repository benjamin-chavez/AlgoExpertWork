# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space

def bubbleSort(array):
    sorted = False
	array_length = len(array)
	while sorted is False:
		sorted = True
		array_length -= 1
		for i in range(array_length):
			if array[i] > array[i+1]:
				sorted = False
				#OPTION 1
				# tmp = array[i]
				# array[i] = array[i+1]
				# array[i+1] = tmp
				
				#OPTION 2
				array[i], array[i+1] = array[i+1], array[i]
	return array
