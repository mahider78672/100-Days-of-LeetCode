✅ Day 63 – Problem: Find Minimum Operations to Make All Elements Divisible by Three
Problem

Given an array of integers, each element can be incremented or decremented by 1 in a single operation.
Goal: make every element divisible by 3 using minimum total operations.

Approach

Modulo arithmetic simplifies the problem:

If an element is already divisible by 3 → 0 operations

Otherwise:

If num % 3 == 1 → subtract 1

If num % 3 == 2 → add 1

Both take exactly one operation.
So, the answer is simply the count of elements where num % 3 != 0.

Complexity

Time: O(N)

Space: O(1)

Language

Java ☕
