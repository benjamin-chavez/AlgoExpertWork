# SOLUTION 2:



# SOLUTION 1:
def threeNumberSum(array, targetSum):
    sol = []
	array.sort()
	
	for i in range(len(array)):
		for j in range(i + 1, len(array)):
			targetToSolve = targetSum - (array[i] + array[j])
			for q in range(j + 1, len(array)):
				if array[q] == targetToSolve:
					sol.append([array[i], array[j], targetToSolve])
					break
							
	return sol 
