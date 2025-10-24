✅ Day 33 – Problem: Swim in Rising Water (LeetCode 778)

Problem Statement:
Given an N×N grid of elevations, find the minimum time required to reach the bottom-right cell,
where time equals the highest elevation encountered along the path.

Approach Used:

Treated the grid as a weighted graph.

Used Dijkstra’s Algorithm with a Min-Heap (PriorityQueue in Java).

Always expanded the cell with the minimum current elevation/time.

Complexity:

Time: O(N² log N)

Space: O(N²)

Language: Java ☕
