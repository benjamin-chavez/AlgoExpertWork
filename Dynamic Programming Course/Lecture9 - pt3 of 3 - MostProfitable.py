 

"""
Problem:
	Unique Paths - MOST PROFITABLE

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
# F(i, j) = max(F(i-1, j), F(i, j-1)) + grid(i,j)
def uniquePaths(grid):      
    m = len(grid)
    n = len(grid[0])
   
    dp = [ [ None for y in range( n ) ] for x in range( m ) ]       # array of int arrays
    
    # Bass Cases
    dp[0][0] = 0

    # Apply Transition Function
    for i in range(m):
        for j in range(n):
            if i > 0 and j > 0:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]) + grid[i][j]
            elif i > 0:
                dp[i][j] = dp[i-1][j] + grid[i][j]
            elif j > 0:
                dp[i][j] = dp[i][j-1] + grid[i][j]

    return dp[m-1][n-1]


my_grid = [
    [0, 2, 2, 1], 
    [3, 1, 1, 1], 
    [4, 4, 2, 0]]
# Answer = 13

my_grid = [
    [0, 2, 2, 50], 
    [3, 1, 1, 100], 
    [4, 4, 2, 0]]
# Answer = 154



print(uniquePaths(my_grid))