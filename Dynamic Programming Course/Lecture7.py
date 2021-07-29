# Lecture 7: Optimization Problem

"""
Problem:
    Paid Staircase

    You are climbing a paid staircase, where each stair has a different price. It takes n steps to reach to the top and you have to pay p[i] to step on the i-th stair. Each time you can climb 1 or 2 steps.

    What is the cheapest route to the top of the staircase?
"""

# Time Complexity: O(n)
# Space Complexity: O(n)
def paidStaircase(n, p):
    dp = []         # Int array of size n+1
    dp[0] = 0
    dp[1] = p[1]

    for i in range(2, n):
        dp[i] = min(dp[i-1], dp[i-2]) + p[i]
    
    return dp[n]





# SPACE OPTIMIZATION:
# Time Complexity: O(n)
# Space Complexity: O(1)
def paidStaircase(n, p):
    dp = []         # Int array of size n+1
    dp[0] = 0
    dp[1] = p[1]

    for i in range(2, n):
        # dp[i] = min(dp[i-1], dp[i-2]) + p[i]
        tmp = min(dp[i-1], dp[i-2]) + p[i]
        dp[0] = dp[1]
        dp[1] = tmp
    
    return dp[n]
