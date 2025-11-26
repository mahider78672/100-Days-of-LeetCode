Day 67 – Problem: Paths in Matrix Whose Sum Is Divisible by K (LeetCode 2435)
Problem

Count all valid paths from top-left to bottom-right such that the sum of numbers on the path is divisible by k.

Approach

Use a 3D DP array:

dp[i][j][r] = number of ways to reach (i, j) with sum % k = r


Transition from:

(i-1, j) → top

(i, j-1) → left

Update modulo with current value:

newMod = (r + grid[i][j]) % k
dp[i][j][newMod] += dp[prev][r]


Final answer → dp[m-1][n-1][0]

Complexity
Type	Value
Time	O(m * n * k)
Space	O(m * n * k)
Language	Java ☕
