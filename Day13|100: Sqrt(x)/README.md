✅ Day 13 – Problem: Sqrt(x)

Problem Statement:
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. Must not use built-in power or sqrt functions.

Solution Approach:

Used Binary Search to find the integer square root.

Checked mid * mid vs x and adjusted search range.

Returned the largest mid such that mid * mid <= x.

Complexity:

Time: O(log n)

Space: O(1)

Language: Java ☕
