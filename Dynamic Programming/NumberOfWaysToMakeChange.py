# O(nd) Time | O(n) - where n is the target amount & d is the number of denomsinations


def numberOfWaysToMakeChange(n, denoms):
    # Create an empty list of n, where the indices represent the dollar amount and the values represent 
	# the number of ways to make change with the given coins
	ways = [0 for dollarAmount in range(n + 1)]
	ways[0] = 1
	# for each coin denom iterate through the full list of n to determine how many ways you can make each
	# amount with the current and all previous denoms
	for denom in denoms:
		for amount in range(1, n + 1):
			if denom <= amount:
				ways[amount] += ways[amount - denom]
	
	# return the number of ways for n	
	return ways[n]
		
	

