"""
    Problem:
        Climbing Stairs

        You are climbing a stair case. It takes n steps to reach the top. With each step you can either climb 1 or 2 steps/stairs. In how many distinct ways can you climb to the top?

    Framework for Solving DP Problems:
        1. Define the objective function:
            f(i) is the number of distinct ways to reach the i-th stair.
        2. Identify the base cases (boundaries)
            f(0) = 1
            f(1) = 1
        3. Write down a recurrence relation for the optimized objective function
            f(n) = f(n-1) + f(n-2)
        4. Determine the order of execution
            bottom-up: we are relying on the solutions from the two previous sub problems
        5. Where to look for the answer?
            f(n)
"""
# Time Complexity: O(n) - where n is the number of stairs
# Space Compelxity: O(n) - we allocate an array of n+1
def climbStairs(n):
    dp = []     # integer array of size of n+1
    dp[0] = 1
    dp[1] = 2
    for i in range(2, n):
        dp[i] = dp[i-1] + dp[i-2]

    return dp[n]


# OPTIMIZED SPACE COMPLEXITY
# Time Complexity: O(n) - where n is the number of stairs
# Space Compelxity: O(1) - we allocate an array of n+1
def climbStairs(n):
    dp = [1, 2]     # integer array of size of n+1
    for i in range(2, n):
        tmp = dp[1] + dp[0]
        dp[0] = dp[1]
        dp[1] = tmp

    return dp[n]