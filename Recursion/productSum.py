# Tip: You can use the type(element) function to check whether an item
# is a list or an integer.

""" Complexity: 
        Time: O(n) where n is the total number of elements in the array and its sub arrays
        Space: O(D) where D is the depth/number of recursive calls on the stack


"""
def productSum(array, depth = 1):
    # Write your code here.
	# pass
	sum_total = 0
	for i in array:
		if type(i) is list:
			sum_total += productSum(i, depth + 1)
		# Base case: list of only integers
		else:
			sum_total += i
	return depth * sum_total
