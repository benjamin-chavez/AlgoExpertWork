# Note: In a real interview it would be important to ask the interviewer if you can mutate the input array or not. This would ultimately impact the Space Complexity.

# O(nlog(n) Time | O(1) Space - Where n is the number of students
def classPhotos(redShirtHeights, blueShirtHeights):
    # Write your code here.
	redShirtHeights.sort()
	blueShirtHeights.sort()
	
	if redShirtHeights[0] > blueShirtHeights[0]:
		tallRow = redShirtHeights[:]
		shortRow = blueShirtHeights[:]
	else:
		shortRow = redShirtHeights[:]
		tallRow = blueShirtHeights[:]
	
	for i in range(0, len(redShirtHeights)):
		if tallRow[i] <= shortRow[i]:
			return False
	
    return True
