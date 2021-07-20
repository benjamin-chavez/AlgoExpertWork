# Max Subset Sum No Adjacent

# SOLUTION 2
# O(n) time | O(1) space
def maxSubsetSumNoAdjacent(array):
	if not len(array):
		return 0
	elif len(array) == 1:
		return array[0]
	first = array[0]
	second = max(first, array[1])
	for i in range(2, len(array)):
		cur_max = max(second, first + array[i])
		first = second
		second = cur_max	
	return second



# SOLUTION 1
# O(n) time | O(n) space
def maxSubsetSumNoAdjacent(array):
    # # Write your code here.
    # # pass
	# # Check if array is empty or only has 1 item
	# 	# Return 0 or [0] respectively
	# # Iterate through array[2:-1]
	# # 
	
	# if not len(array):
	# 	return 0
	# elif len(array) == 1:
	# 	return array[0]
	# max_sum = array[:]
	# max_sum[1] = max(max_sum[0], max_sum[1])
	# for i in range(2, len(array)):
	# 	max_sum[i] = max(max_sum[i-1], max_sum[i-2] + array[i])
	
	# return max_sum[-1]