# My Solution:
# Time O(nlogn) | Space O(1) because we are sorting in place
def minimumWaitingTime(queries):
    # Write your code here.
    queries.sort()
	total_wait = 0
	cur_wait = 0 
	for i in range(1, len(queries)):
		cur_wait += queries[i-1]
		total_wait += cur_wait
		
	
	return total_wait


# Algo Expert Solution:
# Time O(nlogn) | Space O(1) - where n is the number of queries
def minimumWaitingTime(queries):
    queries.sort()
	
	total_wait = 0
	for idx, time in enumerate(queries):
		numQueriesLeft = len(queries) - (idx + 1)
		total_wait += time * numQueriesLeft
		
	
	return total_wait
