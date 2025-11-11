✅ Day 51 – Problem: Merge k Sorted Lists

Problem:
Merge multiple sorted linked lists into one sorted linked list.

Approach:
• Used a Min-Heap (PriorityQueue) to efficiently select the smallest node at each step.
• Insert heads of all lists, extract-min, append to result, push next node of extracted list.

Complexity:
Time: O(N log k)
Space: O(k)

Language: Java ☕
