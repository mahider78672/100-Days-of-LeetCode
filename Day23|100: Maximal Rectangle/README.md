✅ Day 23 – Problem: Maximal Rectangle

Problem Statement:
Find the largest rectangle containing only 1’s in a binary matrix.

Solution Approach:

Treat each row as a histogram of heights.

Apply stack-based “Largest Rectangle in Histogram” logic for each row.

Track the maximum area found.

Complexity:

Time: O(m × n)

Space: O(n)

Language: Java ☕
