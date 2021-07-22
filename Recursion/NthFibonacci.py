# Algo Solution3: Iterative
# O(n) Time | O(1) Space
def getNthFib(n):
    fibSeq = [0, 1]
	
	for i in range(2, n):
		nextFib = fibSeq[0] + fibSeq[1]
		fibSeq[0] = fibSeq[1]
		fibSeq[1] = nextFib
	
	# if n != 0 
	return fibSeq[1] if n != 1 else fibSeq[0]




# Algo Solution2: using memoization
# O(n) Time | O(n) Space
def getNthFib(n, memoize={1: 0, 2: 1}):
	if n in memoize:
		return memoize[n]
	
	memoize[n] = getNthFib(n-2, memoize) + getNthFib(n-1, memoize)
	return memoize[n]




# My Solution1:
# O(2^n) Time | O(n) Space 
def getNthFib(n):
	if n == 1:
		return 0
	elif n == 2:
		return 1
	else:
		return getNthFib(n-2) + getNthFib(n-1)
