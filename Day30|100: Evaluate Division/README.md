✅ Day 30 – Problem: Evaluate Division (LeetCode 399)

Problem Statement:
Given equations like a / b = 2.0, evaluate division queries using the known relations.

Approach Used:

Created a graph where nodes represent variables and edge weights represent division ratios.

Added reciprocal edges for bidirectional relationships.

Used DFS to search for a path between variables and calculate the resulting value.

Complexity:

Time: O(N + Q × E)

Space: O(N + E)

Language: Java ☕
