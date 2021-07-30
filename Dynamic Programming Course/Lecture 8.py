#  Reconstruct the solution to any problem solved with dynamic progamming

"""
Problem:
    Paid Staircase II

    You are climbing a paid staircase. It takes n steps to reach the top and you have to pay p[i] to step on the i-th stair. Each time you can climb either 1 or 2 steps. 

    Return the cheapest path to the top of the staircase.
"""



# Time Complexity: O(n)
# Space Complexity: O(n)
def paidStaircase(n, p = []):
    
    dp = [None] * (n + 1)       #Int array of size n+1
    fromPath = []               #Int array of size n+1
    dp[0] = 0
    dp[1] = p[1]

    for i in range(2, n+1):
        dp[i] = min(dp[i-1], dp[i-2]) + p[i]
        if dp[i-1] < dp[i-2]:
            fromPath.append(i-1)
        else:
            fromPath.append(i-2)
 
    path = []
    fromPath.append(n)
    for i in range(len(fromPath)):
        if i == 0:
            path.append(fromPath[i])
        elif fromPath[i] != fromPath[i-1]:
            path.append(fromPath[i])
 
    return path


# Test Cases
targetStair = 8
price = [0, 3, 2, 4, 6, 1, 1, 5, 3]
print( paidStaircase(targetStair, price))