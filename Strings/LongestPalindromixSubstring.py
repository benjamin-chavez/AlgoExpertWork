# SOLUTION 2 (Best)
# O(n^2) time | O(n) space
def longestPalindromicSubstring(string):
    longest = [0, 1]
	for i in range(1, len(string)):
		odd = getPalindrome(string, i - 1, i + 1)
		even = getPalindrome(string, i - 1, i)
		curSubstring = max(odd, even, key=lambda x: x[1] - x[0])
		longest = max(longest, curSubstring, key=lambda x: x[1] - x[0])
	return string[longest[0] : longest[1]]

def getPalindrome(string, leftIdx, rightIdx):
	while leftIdx >= 0 and rightIdx < len(string):
		if string[leftIdx] != string[rightIdx]:
			break
		leftIdx -=1
		rightIdx += 1
	return [leftIdx+  1, rightIdx]



# SOLUTION 1
# O(n^3) time | O(n) Space
def longestPalindromicSubstring(string):
	longestPal = ""
	for i in range(len(string)):
		for j in range(i, len(string)):
			subString = string[i:j + 1]
			if len(subString) > len(longestPal) and isPalindrome(subString):
				longestPal = subString
	
	return longestPal
	
	
def isPalindrome(string):
	leftIdx = 0
	rightIdx = len(string) - 1
	while leftIdx < rightIdx:
		if string[leftIdx] != string[rightIdx]:
			return False
		leftIdx += 1
		rightIdx -= 1
	return True
	