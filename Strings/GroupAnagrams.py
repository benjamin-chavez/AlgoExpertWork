
# Solution 2 (Best)
# O(w * n * log(n)) time | O(wn) space - where w is the number of words and 
# n is the length of the longest word
def groupAnagrams(words):
    anagrams = {}
	for word in words:
		sortedWord = "".join(sorted(word))
		if sortedWord in anagrams:
			anagrams[sortedWord].append(word)
		else:
			anagrams[sortedWord] = [word]
	return list(anagrams.values())
			


# My Solution 2
# 
def groupAnagrams(words):
    anagrams = []
	
    for i in range(len(words)):
		added = False
		if not len(anagrams):
			anagrams.append([words[i]])
			added = True
		for j in range(len(anagrams)):
			if added is False:
				if "".join(sorted(words[i])) == "".join(sorted(anagrams[j][0])):
					anagrams[j].append(words[i])
					added = True
					break
				elif j == len(anagrams) - 1:
					anagrams.append([words[i]])
					added = True
			else:
				break
	return anagrams
				
					
