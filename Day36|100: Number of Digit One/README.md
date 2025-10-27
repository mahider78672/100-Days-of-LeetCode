✅ Day 36 – Problem: Number of Digit One (LeetCode 233)

Problem Statement:
Given an integer n, count the total number of digit ‘1’s appearing in all non-negative integers less than or equal to n.

Approach Used:

Decomposed n by each digit position (ones, tens, hundreds, etc.).

For each place, computed how often ‘1’ appeared by analyzing higher, current, and lower parts of the number.

Summed contributions for all digit positions to get the total count.

Complexity:

Time: O(log₁₀N)

Space: O(1)

Language: Java ☕
