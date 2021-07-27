# O(nlogn) Time | O(n) Space - Where n is the number of tasks
def taskAssignment(k, tasks):
    sortedTasks = sorted(tasks)
	valueAtIdxDict = convertTaskListToIndiceList(tasks)
	solArray = []
	
	loIdx = 0
	hiIdx = len(tasks) - 1
	
	for i in range(k):
		task1Value = sortedTasks[loIdx]
		task2Value = sortedTasks[hiIdx]
		task1Idx = valueAtIdxDict[task1Value].pop()
		task2Idx = valueAtIdxDict[task2Value].pop()
		solArray.append([task1Idx, task2Idx])
		loIdx += 1
		hiIdx -= 1
	
	return solArray
	
def convertTaskListToIndiceList(tasks):
	valueAtIdxDict = {}
	for idx, task in enumerate(tasks):
		if task in valueAtIdxDict:
			valueAtIdxDict[task].append(idx)
		else:
			valueAtIdxDict[task] = [idx]
	return valueAtIdxDict



""" 
Notes: The difficult component in this problem is that you need the indices from the original list, but you are getting them base on the order of a sorted version of that list.

In order to do this effectively, the solution was to create a new dataStructure using the python dict/hash where the values of the original list are the keys and the indices of the original list are the values.
"""