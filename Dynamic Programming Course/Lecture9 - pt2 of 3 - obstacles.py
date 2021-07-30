 

"""
Problem:
	Unique Paths - WITH OBSTACLES

	A robot is located at the top-left corner of a m x n grid (marked 'S' in the diagram below).
	The robot can only move either down or right at any point in time.

	The robot is trying to reach the bottom-right corner of the grid (marked 'E' in the diagram below).
	
    How many possible unique paths are there?
	+---+---+---+---+
	| S |   |   |   |
	+---+---+---+---+
	|   | 1 | 1 | 1 |
	+---+---+---+---+
	|   |   |   | E |
	+---+---+---+---+
	
    Above is a 3 x 4 grid. How many possible unique paths are there?
"""

# Time Complexity:
# Space Complexity:
# F(i, j) = F(i-1, j) + F(i, j-1)
#               i>0   |     j>0
def uniquePaths(grid):      
    m = len(grid)
    n = len(grid[0])
   
    dp = [ [ None for y in range( n ) ] for x in range( m ) ]       # array of int arrays
    
    # Bass Cases
    dp[0][0] = 1

    # Apply Transition Function
    for i in range(m):
        for j in range(n):
            # Check if obstacle exists
            if grid[i][j] == 1:
                dp[i][j] = 0
                continue

            if i > 0 and j > 0:
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
            elif i > 0:
                dp[i][j] = dp[i-1][j]
            elif j > 0:
                dp[i][j] = dp[i][j-1]

    return dp[m-1][n-1]


my_grid = [
    [0, 0, 0, 0], 
    [0, 0, 1, 1], 
    [0, 0, 0, 0]]
# Answer = 3

# my_m = 3
# my_n = 4
# # Answer = 10

print(uniquePaths(my_grid))