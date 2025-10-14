Day 22 – Problem: Linked List Cycle

Problem Statement:
Detect if a linked list contains a cycle.

Solution Approach:

Used Floyd’s Cycle Detection (Tortoise & Hare).

Fast pointer moves 2 steps, slow pointer moves 1.

If they meet, a cycle is detected.

Complexity:

Time: O(n)

Space: O(1)

Language: Java ☕
