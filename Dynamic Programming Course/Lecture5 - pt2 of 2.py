"""
    Problem:
        Climbing Stairs (K steps)

        You are climbing a stair case. It takes n steps to reach the top. With each step you can either climb 1..K steps/stairs. In how many distinct ways can you climb to the top?

    Framework for Solving DP Problems:
        1. Define the objective function:
            f(i) is the number of distinct ways to reach the i-th stair by making 1 to k steps
        2. Identify the base cases (boundaries)
            f(0) = 1
            f(1) = 1
        3. Write down a recurrence relation for the optimized objective function
            f(n) = f(n-1) + f(n-2) + ... + f(n-k)
        4. Determine the order of execution
            bottom-up: we are relying on the solutions from the two previous sub problems
        5. Where to look for the answer?
            f(n)
"""

# Time Complexity: O(nk)
# SPace Complexity: O(n) => you could optimize to O(k) using the same optimization from the previous problem in lecture 4's optimaztion
def climbStairs(n, k):
    dp = []         # int array of n+1 size
    dp[0] = 1
    dp[1] = 1
    for i in range(2, n):
        # dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + ... + dp[i-k]
        for j in range(1, k):
            if i-j < 0:
                continue
            dp[i] += dp[i-j]

    
    return dp[n]
