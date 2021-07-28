"""
    Problem: 
    Find the sum of the first N numbers.

    Objective Function:
    f(i) is the sum of the first i elements.

    Recurrence Relation:
    f(n) = f(n-1) + n
"""

# n = 0
def nSum(n):
    dp = []
    dp[0] = 0   #f(n=0)
    for i in range(1, n):
        dp[i] = dp[i-1] + i

    return dp[n]

