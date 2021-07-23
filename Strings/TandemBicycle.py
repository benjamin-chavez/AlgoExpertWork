# Solution 1: My Solution
# O(nlogn) Time | O(1) Space
def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
	sumTotal = 0
	redShirtSpeeds.sort()
	blueShirtSpeeds.sort(reverse = True) if fastest else blueShirtSpeeds.sort()	
	for i in range(len(redShirtSpeeds)):
		sumTotal += max(redShirtSpeeds[i], blueShirtSpeeds[i])
	return sumTotal
	



# The Algo Expert Solution was honestly a bit more verbose, but it did have a reverse in place function:

def reverseArrayInPlace(array):
    start = 0
    end = len(array) - 1
    while leftIdx < rightIdx:
        array[leftIdx], array[rightIdx] = array[rightIdx], array[leftIdx]
        leftIdx += 1
        rightIdx +=1