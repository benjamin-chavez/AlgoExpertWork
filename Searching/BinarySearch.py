# O(log(n)) time | O(log(n)) space
def binarySearch(array, target):
    # Write your code here.
    # pass
	# define variable: start, middle, & end
	lo = 0
	hi = len(array) - 1
	# mid = (hi - lo) // 2
	
	# start = array[0]
	# end = array[len(array)]
	# middle = (end - start) / 2
	# while start does not equal end (for loop)
	# for idx, item in enumerate(array):
	while (lo <= hi):
		mid = lo + (hi - lo) // 2
		if target < array[mid]:
			hi = mid -1
		elif target > array[mid]:
			lo = mid + 1
		else:
			return mid
	
		
	# if start equals target, return index
	return -1
