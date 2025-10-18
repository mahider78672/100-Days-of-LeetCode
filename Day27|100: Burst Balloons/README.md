✅ Day 27 – Problem: Burst Balloons

Problem Statement:
Find the maximum coins from bursting balloons in the optimal order.

Approach Used:

Added 1 to both ends of the array.

Used Interval DP to find max coins for each subarray.

dp[left][right] = max coins from bursting balloons between left and right.

Complexity:

Time: O(n³)

Space: O(n²)

Language: Java ☕
