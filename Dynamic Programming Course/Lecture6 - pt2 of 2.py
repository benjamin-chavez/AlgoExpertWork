"""
    Problem:
        Climbing Stairs (K steps - RED STAIRS VERSION)

        You are climbing a stair case. It takes n steps to reach the top. With each step you can either climb 1..K steps/stairs. In how many distinct ways can you climb to the top?

        You cannot step on red stairs!

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
# Space Complexity: O(k) => Optimized Space

# Loop around/through array by moding by k (i % k)
# stairs = [False, True, False, True, True, False, False, False]
def climbStairs(n, k, stairs):
    dp = []       # Int array of size k
    dp[0] = 1
    
    for i in range(1, n):
        for j in range(1, k - 1):
            if i - j < 0:
                continue
            # If current stair is red, set number of ways to 0. Note current Stair = i - 1 because our arrays starts at index 0
            if stairs[i-1]:
                dp[i % k] = 0
            else:
                dp[i % k] += dp[(i-j) % k]
        
    return dp[n % k]
