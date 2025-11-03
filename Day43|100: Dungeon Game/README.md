✅ Day 43 – Problem: Dungeon Game (LeetCode 174)

Problem:
Find the minimum initial health needed for the knight so health never drops below 1.

Approach:
Used Bottom-Up Dynamic Programming.
dp[i][j] stores the minimum health required to enter cell (i, j).
Computed values starting from bottom-right toward the top-left.

Formula:
need = min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j]
dp[i][j] = max(1, need)

Complexity:
Time: O(m × n)
Space: O(m × n)

Language: Java ☕
